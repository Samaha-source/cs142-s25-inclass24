package lab6;

import java.util.ArrayList;

public class RecursiveFunctions {

    public static void main(String[] args) {
        // Test factorial
        testFactorial();

        // Test fibonacci
        //testFibonacci();

        // Write more tests or calls here.
        // Feel free to comment out earlier calls.
    }

    /** Function for testing the factorial function. */
    public static void testFactorial() {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("i = " + i + ", fact(i) = " + fact(i));
        }
    }

    /** Function for testing the fibonacci function. */
    public static void testFibonacci() {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println("i = " + i + ", fib(i) = " + fib(i));
        }
    }

    /** Recursive factorial */
    public static long fact(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return fact(n-1) * n;
        }
    }

    /** Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".*/
    public static String stringClean(String str)
    {
        if (str.length() < 2)
        {
            return str;
        }
        if (str.charAt(0) == str.charAt(1))
        {
            return stringClean(str.substring(1));
        }
        else
        {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }

    /** Recursive fibonacci */
    public static long fib(int n) {
        return 0;// remove this when you start writing
    }

    /** Returns the sum of the first n integers, starting from 1. */
    public static long sumOfFirstN(int n) {
        return 0; // remove this when you start writing
    }

    /** Returns 2 to the nth power. */
    public static long twoToNthPower(int n) {
        return 0; // remove this when you start writing
    }


}
