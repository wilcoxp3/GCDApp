/*
 * The Validation class contains two static methods for input validation.
 * The getInt method receives a valid integer from the user. The getContinue
 * method returns a Boolean indicating the user's choice to continue or quit.
 */

package gcdapp;
import java.util.Scanner;
public class Validation
{
    //getInt
    //prompts user to enter an interger
    //returns a valid integer
    public static int getInt(String prompt)
    {
        //create new Scanner object and declare and initialize user choice to 0
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        //loop until user enters a valid int
        while (true)
        {
            System.out.print (prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                break;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
        return i;
    }
    
    //getContinue
    //prompts the user to continue by entering 'y' or 'n'
    //returns boolean true or false corresponding to yes or no respectively
    public static boolean getContinue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nContinue? (y/n): ");
        boolean answer;
        String choice = sc.next();
        
        while(true)
        {
            if (choice.equalsIgnoreCase("y"))
            {
                answer = true;
                break;
            }
            else if (choice.equalsIgnoreCase("n"))
            {
                answer = false;
                break;
            }
            else
            {
                System.out.print("Invalid choice. Please choose 'Y' or 'N': ");
                sc.nextLine();
                choice = sc.next();
            }
        }
        return answer;
    }
}