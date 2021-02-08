
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Die
     */
    private int roll;
    public Die()
    {
        roll = this.roll();
    }
    
    public int roll()
    {
        // initialise instance variables
        roll = (int)(Math.random() * 6 + 1);
        return roll;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getResult()
    {
        // put your code here
        return roll;
    }
}
