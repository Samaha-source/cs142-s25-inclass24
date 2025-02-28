package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion3 {
    public static void main(String[] args)
    {
        // test sum of arraylist:
        //ArrayList<Integer> mylist = new ArrayList<Integer>(Arrays.asList(2, 4, 6));
        //System.out.println("Sum is " + sumOfArrayList(mylist));

        // test max of arraylist:
        System.out.println(maxOfArray( new int[] {2, 9, 11, 43, -963, 22, -1}));

        //Recursion Practice Problems
        System.out.println(mult(new int[] {5, 12, 45, 667}));
    }

    // Calculate the sum of all the elements in an arraylist.
    public static int sumOfArrayList(ArrayList<Integer> list)
    {
        return sumOfArrayList(list, 0);
    }

    // Helper function for above.
    private static int sumOfArrayList(ArrayList<Integer> list, int leftIdx)
    {
        if (leftIdx == list.size()-1) {  // if there's only one element in our "sub-list"
            return list.get(leftIdx);
        }
        else {
            int smallerSum = sumOfArrayList(list, leftIdx + 1);
            return list.get(leftIdx) + smallerSum;
        }
    }

    // Calculate the largest element in an arraylist.
    public static int maxOfArray(int[] array)
    {
        return maxOfArray(array, 0);
    }

    // Helper function for above.  Assumes an array with one or more ints.
    private static int maxOfArray(int[] array, int leftIdx)
    {
        if (leftIdx == array.length-1) {  // if there's only one element in our "sub-list"
            return array[leftIdx];
        }
        else {
            int recursiveMax = maxOfArray(array, leftIdx + 1);
            if(array[leftIdx] >= recursiveMax)
            {
                return array[leftIdx];
            }
            else
            {
                return recursiveMax;
            }
        }
    }

    /**Recursion Practice Problem 2*/
    public static int mult(int[] array)
    {
        return mult(array, 0);
    }

    public static int mult(int[] array, int bookmark)
    {
        if (bookmark == array.length-1)
        {
            return array[bookmark];
        }
        return array[bookmark] * mult(array, bookmark+1);
    }

}