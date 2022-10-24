import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author  Salvatore Anzalone
 * @version 10.24.2022
 */

public class Room 
{
    private String description;
    private String item01, item02, item03, item04, item05;
    private String details01, details02, details03, details04, details05;
    private HashMap<String, Room> exits;        // stores exits of this room.

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * @return The item in the room.
     * @return The details of the item.
     */
    public String getItem01Details()
    {
        String item01 = "Crowbar\n\n";
        String details01 = "Weight: 1.32 lbs\n" +
                           "Length: 300 mm\n" +
                           "Purpose: Helps detach planks. But " +
                           "what about the doors?";
        
        return item01;
    }
    
    /**
     * @return The item in the room.
     * @return The details of the item.
     */
    public String getItem02Details()
    {
        String item02 = "Fire Extinguisher\n\n";
        String details02 = "Weight: 10 lbs\n" +
                           "Height: 533.4 mm\n" +
                           "Purpose: Helps put out fire.";
        
        return item02;
    }
    
    /**
     * @return The item in the room.
     * @return The details of the item.  This is a basic food item.
     */
    public String getItem03Details()
    {
        String item03 = "Ham Sandwhich";
        String details03 = "Weight: 3 lbs\n" +
                           "Height: 152.4 mm\n" +
                           "Purpose: Helps prevent starvation, "+
                           "and gives you energy to help provide " +
                           "you strength.";
        
        return item03;
    }
    
    /**
     * @return The item in the room.
     * @return The details of the item.
     * This is a food item that can't be eaten.
     */
    public String getItem04Details()
    {
        String item04 = "Rotten Apple";
        String details04 = "Weight: 0.33 lbs\n" +
                           "Height: 4,000 mm\n" +
                           "Purpose: You don't want to know....";
        return item04;
    }
    
    /**
     * @return The item in the room.
     * @return The details of the item.
     */
    public String getItem05Details()
    {
        String item05 = "Flashlight";
        String details05 = "Weight: 2.625 lbs\n" +
                           "Length: 76.2 mm\n" +
                           "Purpose: Helps see things in front of you" +
                           " better.  And there's batteries in it!" +
                           " Hmm... Seems it's only at 50% power.";
        return item05;
    }
    
    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }
}