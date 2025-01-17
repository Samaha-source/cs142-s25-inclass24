package Intro;
import java.util.Scanner;//This is necessary so we can use the Scanner class!

public class Program3UserInput
{
    public static void main(String [] args) //We will discuss this more in later classes...but this is the part that Actually Runs in Java.
    {
        Scanner scanVariableName;
        scanVariableName = new Scanner(System.in);

        String inputVariable;
        System.out.println("Please enter some text in the terminal.");
        inputVariable = scanVariableName.nextLine();

        System.out.println("The input you entered is: ");
        System.out.println(inputVariable);

        System.out.println("Please enter an int in the terminal.");
        int inputNumber = scanVariableName.nextInt();

        if(inputNumber > 100)
        {
            System.out.println("The number is greater than 100!");
        }
        else if(inputNumber < 0)
        {
            System.out.println("The number is less than 0.");
        }
        else if(inputNumber == 50)
        {
            System.out.println("The number exactly equals 50.");
        }
        else
        {
            System.out.println("This statement executes if none of the above statements do.");
        }

        System.out.println("Please enter an int in the terminal.");
        int i = scanVariableName.nextInt();

        if(i % 2 == 0)
        {
            System.out.println("This number is even!");
            if(i == 0)
            {
                System.out.println("(PS: This number is also 0.)");
            }
        }
        else
        {
            System.out.println("This number is odd!");
        }
    }
}
