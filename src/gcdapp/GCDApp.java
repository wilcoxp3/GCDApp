/*
 * Workbook Project 4-3 (Greatest Common Divisor)
 * Professor: Tedd Sperling
 * Course: Introduction to JAVA - (22150)
 * Student: Paul Wilcox
 * This program receives as input from the user two integers and displays the
 * greatest common divisor of the two.
*/

package gcdapp;
public class GCDApp
{
    public static void main(String[] args)
    {   
        //Display the opening message and begin main program loop
        System.out.print("Greatest Common Divisor Finder\n");
        while (true)
        {
            //get each integer using Validation.getInt
            int number1 = Validation.getInt("\nEnter first number: ");
            int number2 = Validation.getInt("Enter second number: ");
            
            //find greatest common divisor using Function.findGCD
            
            System.out.print("Greatest common divisor: " + Function.findGCD(number1, number2));
            
            //prompt to repeat the operation
            if (Validation.getContinue() == false)
            {
                break;
            }
        }
        System.out.print("DONE\n");
    }
}