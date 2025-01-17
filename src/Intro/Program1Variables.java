package Intro;
//This program demonstrates some common variable types.
public class Program1Variables
{
    public static void main(String [] args) //We will discuss this more in later classes...but this is the part that Actually Runs in Java.
    {
        //Here we're *declaring* each of our variables
        int i;
        double d;
        char c;
        boolean bool;
        String s;

        //...And here we initiate them!

        i = 5;

        d = .1243;

        bool = true;

        c = 'c';

        s = "This is a list of different variables, all printed out!!";

        //Notice that println accepts each of these variables.
        System.out.println(s);
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
    }
}
