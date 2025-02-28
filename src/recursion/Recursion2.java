package recursion;

public class Recursion2 {

    public static void main(String[] args)
    {

        weird(4);
        //factRec(6);
        /*for (int i = 1; i <= 10; i++)
        {
            long factAnswer = fact(i);
            System.out.println("The factorial of " + i + " is " + factAnswer);
        }
        for (int i = 1; i <= 10; i++)
        {
            long factAnswer = factRec(i);
            System.out.println("The factorial of " + i + " is " + factAnswer);
        }*/
    }

    /** Factorial, iterative version */
    public static long fact(int num)
    {
        long product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        return product;
    }

    /**
     * Factorial, recursive version.
     *
     * Recursive formulation:
     *   BASE CASE: If n == 1, fact(1) = 1
     *   RECURSIVE CASE: If n >= 2, fact(n) = fact(n-1) * n
     */
    public static long factRec(int num)
    {
        if (num == 1) {  // base case
            return 1;
        }
        else {  // recursive case
            long smallerAnswer = factRec(num-1);
            return smallerAnswer * num;
            // two lines above often combined: return factRec(num-1) * num;
        }
    }

    /** Reverse a string, iterative version */
    public static String reverse(String str)
    {
        String answer = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            answer = answer + str.charAt(i);
        }
        return answer;
    }

    /**
     * Reverse a string, recursive version.
     *
     * Recursive formulation:
     *   BASE CASE: If str only has one letter, then the answer is str
     *   RECURSIVE CASE: If str has more than one letter:
     *     char lastChar = last character of str
     *     String smaller = everything in str except the last char
     *     String revSmaller = reverse(smaller)
     *     Answer is lastChar + revSmaller
     */
    public static String reverseRec(String str)
    {
        return ""; // remove this when you start coding
    }

    /**
     * What does this function do?
     */
    public static void weird(int n)
    {
        if (n == 0) {
            return;
        }
        else {
            System.out.println(n);
            weird(n - 1);
            //System.out.println(n);
            //weird(n - 1);
        }
    }

    /**
     * Fibonacci sequence.
     */
    public static int fib(int n)
    {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
}