/**
 * Write a description of class Craps here.
 *
 * @author Rufus Marcussen
 * @version 2/7/2021
 */
import java.util.Scanner;
public class Craps
{
    /**
     * Constructor for objects of class Craps
     */
    public static void main(String[] args)
    {
        boolean playAgain = true;
        while(playAgain == true)
        {
        Die d1 = new Die();
        Die d2 = new Die();
        int total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Lets play craps!");
        System.out.println("Press Enter to roll your dice");
        String Kyle = in.nextLine();
        if (Kyle.equals(""));
        {
            total = d1.roll() + d2.roll();
        }
        if (total == 7 || total == 11)
        {
            System.out.println("You've rolled a: " + total);
            System.out.println("You've Won the Game!");
        }
        else if (total == 2 || total == 3 || total == 12)
        {
            System.out.println("You've rolled a: " + total);
            System.out.println("You've Lost the Game.  Too bad.");
        }
        else if (total == 1 || total == 4 || total == 5 || total == 6 || total == 8 || total == 9 || total == 10)
        {
            int point = total;
            System.out.println(point + " is your point");
            System.out.println("Press Enter to roll again");
            String Kyle1 = in.nextLine();
            if (Kyle1.equals(""));
            {
                total = d1.roll() + d2.roll();
            }
            while (total != 7 && total != point)
            {
                System.out.println("You've rolled a: " + total);
                String Kyle2 = in.nextLine();
                if (Kyle2.equals(""));
                {   
                    total = d1.roll() + d2.roll();
                }
            }
            if (total == point)
            {
                System.out.println("You've rolled a: " + total);
                System.out.println("You've Won the Game!");
            }
            else 
            {
                System.out.println("You've rolled a: " + total);
                System.out.println("You've Lost the Game.  Too bad.");
            }
        }
        System.out.println("Do you want to play again(y or n)");
        String ans = in.nextLine();
        if (ans.equals("y"))
        {
            playAgain = true;
        }
        else
        {
            playAgain = false;
        }
    }
    }
}
