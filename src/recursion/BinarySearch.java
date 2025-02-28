package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args)
    {
        // test binary search, iterative version:
        int[] sortedList = new int[]{6,13,14,25,33,43,51,53,64,72,84,93,95,96,97};
        int indexFound = binarySearchIter(sortedList, 7);
        System.out.println("Iterative version: found at index " + indexFound);

        // test binary search, recursive version:
        indexFound = binarySearchRec(sortedList, 7);
        System.out.println("Recursive version: found at index " + indexFound);
    }


    // Iterative binary search --- remember the array must be sorted!
    public static int binarySearchIter(int[] list, int key) {
        int low = 0; // far left index
        int high = list.length - 1;  // far right index

        while (high > low) {
            int mid = (low + high) / 2;          // find midpoint
            if (list[mid] > key) {           // if middle element > key
                high = mid - 1;                  //   next time, look in left half of arraylist
            } else if (list[mid] < key) {    // if middle element < key
                low = mid + 1;                   //   next time, look in right half of arraylist
            } else {                             // if middle element == key
                return mid;                      //   return this middle element index
            }
        }
        return -1; // key not found
    }

    // Recursive binary search.
    public static int binarySearchRec(int[] list, int key)
    {
        return binarySearchRec(list, key, list.length-1, 0);
    }

    // Helper method for above.
    public static int binarySearchRec(int[] list, int key, int high, int low)
    {
        int mid = (int) Math.floor((high + low)/2.0);

        if(list[mid] == key)
        {
            return mid;
        }
        else if(low > high)
        {
            return -1;//This indicates the index was not found.
        }
        else if(list[mid] > key)
        {
            return binarySearchRec(list, key, mid - 1, low);
        }
        else
        {
            return binarySearchRec(list, key, high, mid+1);
        }
    }
}