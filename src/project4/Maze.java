package project4;

import java.awt.*;
import java.io.InputStream;
import java.util.Scanner;

public class Maze {
    private SimpleCanvas canvas; // the canvas the maze will be drawn on.

    // Declare your instance variables here.

    public Maze() { // you can add any parameters you want to the constructor
        // Your code here.
        canvas = new SimpleCanvas(0, 0); // change these dimensions!
        canvas.show();
    }

    /** Load a maze from the given text file and store into appropriate
     * instance variables.
     */
    private void loadMaze(String filename) {
        InputStream is = Maze.class.getResourceAsStream(filename);
        if (is == null) {
            System.err.println("Could not open file: " + filename);
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        // Use two calls to scan.nextInt() here to read
        // the number of rows and number of columns.

        scan.nextLine(); // skip the enter keypress

        while (scan.hasNextLine()) {
            // Write this loop to read each line of the maze itself
            // and convert it into whatever format you're using.
            // You may also add/modify other things outside of the loop, of course.
        }
    }

    /** Draw the maze on the canvas. */
    public void drawMaze() {
        canvas.clear();

        // Write your maze-drawing code here.

        canvas.update();
    }

    /** Draw the maze on the canvas, including the current position of the patronus. */
    public void drawMazeWithPatronus(int patronusRow, int patronusCol) {
        // Write your maze-drawing code here.  Also draw the patronus at the coordinates given.

        canvas.update();
    }

    /** Initial function to get the recursion started for recursive formulation 1:
     * Is it possible to solve this maze?
     */
    public boolean canSolve() {

        // Find Harry's location in the maze.

        drawMaze();
        canvas.waitForClick();

        // Now call canSolve, starting the patronus at whatever Harry's location is.
        // Return the value that canSolve returns.

        return true; // remove this when you start.
    }

    /** Helper function for canSolve that takes the current position of the patronus
     * as parameters.
     */
    private boolean canSolve(int patronusRow, int patronusCol) {
        // Print that the patronus has arrived here.
        // Draw the maze with the patronus.
        // Pause the canvas for a moment.

        // Base case: Are we done with the search?
        // In other words, is the current location of the patronus where the cup is?
        //   If yes, return true (indicating the cup was found).
        //   If no, keep going below.

        // Drop a breadcrumb at the patronus's location.

        // Can the patronus move NORTH from its current position?
        //    If yes, try to solve the maze from one step north.
        //    Examine the boolean value that is returned from the recursive call.
        //    If this value is true, then that means the recursive call found a solution
        //      and this call should return true as well.

        // Can the patronus move SOUTH from its current position?
        //    If yes....(follow same idea as above)
        // Same for EAST, then WEST.

        // If we get here, it means the patronus cannot find the cup from its current position,
        // since trying all four possible directions failed (either all returned false, or the
        // patronus couldn't move in that direction).  It therefore must be in a dead end.

        // Pick up the breadcrumb from the current location because breadcrumbs only mark
        // the solution, and the patronus didn't find one from here.

        // Print that the patronus has is about to backtrack from here.
        // Draw the maze with the patronus.
        // Pause the canvas for a moment.

        return false; // indicating the patronus failed, and should backtrack if possible.
    }

    /** Initial function to get the recursion started for recursive formulation 2:
     * What are the directions (sequence of N/S/E/W steps) to solve the maze?
     */
    public String directionalSolve() {

        // Find Harry's location in the maze.

        drawMaze();
        canvas.waitForClick();

        // Now call directionalSolve, starting the patronus at whatever Harry's location is.
        // Return the value that directionalSolve returns, modified appropriately.
        // Hint: there may be an extra character!

        return ""; // remove this when you start.
    }

    /** Helper function for directionalSolve(). */
    private String directionalSolve(int patronusRow, int patronusCol) {
        // Print that the patronus has arrived here.
        // Draw the maze with the patronus.
        // Pause the canvas for a moment.

        // Base case: Are we done with the search?
        // In other words, is the current location of the patronus where the cup is?
        //   If yes, return "C" (indicating the cup was found here).
        //   If no, keep going below.

        // Drop a breadcrumb at the patronus's location.

        // Can the patronus move NORTH from its current position?
        //    If yes, try to solve the maze from one step north.
        //    Examine the String value that is returned from the recursive call.
        //    If this value is not "X", then that means the recursive call found a solution
        //      and this String is the path to the solution.
        //    Update this String to reflect that we moved NORTH to find the solution,
        //      then return the updated String.

        // Can the patronus move SOUTH from its current position?
        //    If yes....(follow same idea as above)
        // Same for EAST, then WEST.

        // If we get here, it means the patronus cannot find the cup from its current position,
        // since trying all four possible directions failed (either all returned false, or the
        // patronus couldn't move in that direction).  It therefore must be in a dead end.

        // Pick up the breadcrumb from the current location because breadcrumbs only mark
        // the solution, and the patronus didn't find one from here.

        // Print that the patronus has is about to backtrack from here.
        // Draw the maze with the patronus.
        // Pause the canvas for a moment.

        return "X"; // indicating the patronus failed, and should backtrack if possible.
    }
}


