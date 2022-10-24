/**
 * Write a description of class Player here.
 *
 * @author Salvatore Anzalone
 * @version 10.24.2022
 */
public class Player
{
    //Gives details about the player.
    private String details;
    //Gives player's gender
    private String gender;
    //Gives player's height
    private int height;
    //Gives player's weight
    private int weight;

    /**
     * Constructor for objects of class Player.  However,
     * the details string object will only be present, since it
     * provides a default gender, height, and weight.
     */
    public Player()
    {
        String details = "Gender: Male\n" +
                         "Height: 5'\n" +
                         "Weight: 110 lbs";
    }

    /**
     * Gives the details stated in the constructor, but the details
     * of the player are official.
     *
     * These details can be fantasized if you want to get creative.
     * @return    the sum of x and y
     */
    public void officialDetails()
    {
        if(false)
        {
            System.out.println("Provide gender: " + gender);
            System.out.println("Provide height: " + height + " feet");
            System.out.println("Provide weight: " + weight);
            
            String details = "Gender: " + gender + "\n" +
                             "Height: " + height + " feet\n" +
                             "Weight: " + weight + "lbs";
        }
    }
}