package project2;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class GumdropGatherer {

    /**
     * The main control function for the game.
     */
    public static void main(String[] args)
    {
        // Algorithm:
        // Ask for input for rows, columns, and points.
        // Set up the canvas.
        // Initialize the board to random numbers (gumdrop colors).
        // As long as the game is not over:
        //      Print out how many points the player has.
        //      Draw the board.
        //      Let the user pick a gumdrop (but only one with at least one neighbor of the same color).
        //      "Mark" the gumdrop by switching it to its negative value.
        //      Spread the negative number to all neighbors of the same (positive) number, until it can't spread anymore.
        //      Draw the board (with white for the marked gumdrops).
        //      Replace the marked gumdrops with empty spaces (zeroes).
        //      Let gravity bring down any gumdrops that need to come down.  Draw the board after each iteration of gravity.
        //      Fill the empty slots on the board with random gumdrops.
        //      Draw the board.
        //      Calculate how many points are earned, and update the user's score.
        // When the game ends, print the final score.
    }

    /**
     * Draws the current state of the gumdrop board on the canvas.
     */
    public static void draw(SimpleCanvas canvas, int[][] board) {
        canvas.clear();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                // Fill in code here.  Use tic-tac-toe as a guide.
                // Remember that each gumdrop number represents what color it should be:
                // 1-4 are colors of your choice, negative numbers indicate "marked" gumdrops
                // that are about to be removed, and should be drawn white (or some other special color),
                // and 0 is an empty cell.
            }
        }
        canvas.update();
    }

    /**
     * Allows the user to click the game board on a gumdrop.  This function will not end
     * until the user selects a gumdrop with at least one neighbor of the same color.
     * Returns a 2-element integer array of the row and column that was clicked.
     */
    public static int[] handleMouseClick(SimpleCanvas canvas, int[][] board)
    {
        // Use the equivalent function from tic-tac-toe as a guide.
        // You will need to use a loop to ensure the user cannot select a gumdrop with no
        // neighbors of the same color.  Note that the function returns an int[] array;
        // this is so you can return a 2-element array of the row & column that the user
        // clicked on (this information is needed back in the main method).

        // Algorithm: Wait for a mouse click, convert the x/y coordinates to row/column,
        // make sure it's a valid gumdrop (has at least one neighbor of the same color),
        // and return it if its valid.  If it's not valid, keep getting more mouse clicks until it is.

        // Example of how to return the array:
        // int[] clickedRowCol = new int[] { row, col };
        // return clickedRowCol;

        // This line below is only here so the program will compile and run.  You should remove it
        // when you start writing this method.
        return null;
    }

    /**
     * Prints the state of the gumdrop board.  Useful for when the graphics aren't working yet.
     */
    public static void printBoard(int[][] board)
    {
        for (int row = 0; row < board.length; row++)
        {
            System.out.println(Arrays.toString(board[row]));
        }
    }
}
