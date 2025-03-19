package lab7;

import java.util.ArrayList;

public class RecursiveFunctions2 {

    public static void main(String[] args) {
        // Write tests or calls here.
        // Feel free to comment out earlier calls.
    }

    /** Create a sum triangle from the input array
     *
     * A sum triangle is a series of print statements where the output of the program should form a triangle, where the top of the triangle is the sum of all the elements in the array.
     *
     * In this example [1,2,3,4,5] is the input array
     *
     * [15]
     * [1, 14]
     * [1,2,12]
     * [1.2.3,9]
     * [1,2,3,4,5]
     *
     * @param the input array
     */
    public static void createSumTriangle(int n[])
    {
        //Your code here!
    }

    public static void findTheLargestElement(int n[])
    {
        //Your code here!
    }

    /** Function for testing the factorial function. */
    /** A funky function. */
    public static void funky(int n)
    {
        if (n == 0) {
            return;
        }
        else {
            funky(n-1);
            System.out.println(n);
            funky(n-1);
            System.out.println(n);
            funky(n-1);
        }
    }

    /** Function for finding the maximum number in an arrar recursively*/
    public static void findMaxNumberInArray(int n[])
    {
        //Your code here!
    }


}
