//Nate Phillips, professor for COMP 142
package Intro;

//These statements are import statements-they pull in functionality you may want to use.
//For example, this package lets you use the *scanner.*
import java.util.Scanner;

//The class file - defines a set of variables and functions.  (We'll talk more about this later.)
public class GuessTheRandomNumber {

    //This is the line that starts your program's execution...
    public static void main(String[] args)
    {
        //Variable declarations - can be with or without initialization.
        int numRandom = 50;   // this will get replaced with a random number generator
        int userGuess;

        //Calling a built-in java function...
        //The argument is in the parentheses.
        System.out.println("Welcome to the game!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userGuess = scanner.nextInt();
        System.out.println("Your guess was " + userGuess);

        //Our first conditional statement!  Notice the curly brackets containing the if clause.
        if (userGuess < numRandom)
        {
            System.out.println("Your guess is too small!");
        }
        else if (userGuess > numRandom)
        {
            System.out.println("Your guess is too big!");
        }
        else
        {
            System.out.println("You guessed the number!");
        }
    }
}