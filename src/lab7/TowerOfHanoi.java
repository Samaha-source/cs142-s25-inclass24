package lab7;

import java.awt.*;
import java.util.ArrayList;

/** Tower of Hanoi simulation. */
public class TowerOfHanoi {
    // stacks of disks
    private ArrayList<Integer> stackA;
    private ArrayList<Integer> stackB;
    private ArrayList<Integer> stackC;

    // number of total disks
    private int numDisks;

    // the canvas
    private SimpleCanvas canvas;

    // the colors of the disks, initialized randomly
    private ArrayList<Color> diskColors;

    // the pause time between disks moving
    private int pauseTime;

    public TowerOfHanoi(int numDisks, int pauseTime)
    {
        this.numDisks = numDisks;
        this.pauseTime = pauseTime;

        // make empty stacks
        stackA = new ArrayList<Integer>();
        stackB = new ArrayList<Integer>();
        stackC = new ArrayList<Integer>();

        // make empty colors arraylist
        diskColors = new ArrayList<Color>();

        // add disks to stack A
        for (int i = numDisks; i > 0; i--)
        {
            stackA.add(i);
            diskColors.add(new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));
        }

        // create a canvas
        canvas = new SimpleCanvas(600, 500);
    }

    /** Run the simulation. */
    public void run() {
        canvas.show();
        draw();
        canvas.setPenColor(Color.BLACK);
        canvas.drawString(20, 20, "Click screen to begin!");
        canvas.update();
        canvas.waitForClick();

        // begin simulation
        moveTopN(stackA.size(), 'A', 'C', 'B');
    }

    /** Recursive function that moves "n" disks from startStack to endStack,
     * using tempStack as the intermediate storage stack.
     */
    private void moveTopN(int n, char startLetter, char endLetter, char tempLetter)
    {
        ArrayList<Integer> startStack, endStack, tempStack;

        // convert stack letters to actual stacks
        if (startLetter == 'A') { startStack = stackA; }
        else if (startLetter == 'B') { startStack = stackB; }
        else { startStack = stackC; }
        if (endLetter == 'A') { endStack = stackA; }
        else if (endLetter == 'B') { endStack = stackB; }
        else { endStack = stackC; }
        if (tempLetter == 'A') { tempStack = stackA; }
        else if (tempLetter == 'B') { tempStack = stackB; }
        else { tempStack = stackC; }

        // Are we moving one disk or many disks?
        if (n == 1) { // base case
            int topDisk = startStack.get(startStack.size()-1); // get the disk on top of the starting stack
            startStack.remove(startStack.size()-1); // remove top (last) disk
            endStack.add(topDisk);  // add this disk to the top of the stack it's going to

            draw();
            canvas.pause(pauseTime);
        }
        else { // recursive case
            moveTopN(n-1, startLetter, tempLetter, endLetter);
            moveTopN(1, startLetter, endLetter, tempLetter);
            moveTopN(n-1, tempLetter, endLetter, startLetter);
        }
    }

    /** Draw the stacks (you can ignore this method). */
    private void draw()
    {
        canvas.clear();
        int widthOfWidestDisk = (int)((canvas.getWidth() / 3) * .9); // divide into thirds with space for gap
        int diskWidthChange = ((widthOfWidestDisk / (numDisks + 1)));
        int diskHeight = Math.min(20, canvas.getHeight() / (numDisks + 1)); // height of one disk

        // draw stack A (left stack)
        int bottomOfDisk = canvas.getHeight() - 2;
        for (int i = 0; i < stackA.size(); i++)
        {
            int diskNumber = stackA.get(i);
            Color diskColor = diskColors.get(diskNumber - 1);
            int diskWidth = widthOfWidestDisk - diskWidthChange * (numDisks - diskNumber);
            int diskCenterX = canvas.getWidth() / 6;
            canvas.setPenColor(diskColor);
            canvas.drawFilledRectangle(diskCenterX - diskWidth / 2, bottomOfDisk - diskHeight, diskWidth, diskHeight - 1);

            bottomOfDisk -= diskHeight;
        }

        // draw stack B (middle stack)
        bottomOfDisk = canvas.getHeight() - 2;
        for (int i = 0; i < stackB.size(); i++)
        {
            int diskNumber = stackB.get(i);
            Color diskColor = diskColors.get(diskNumber - 1);
            int diskWidth = widthOfWidestDisk - diskWidthChange * (numDisks - diskNumber);
            int diskCenterX = canvas.getWidth() / 2;
            canvas.setPenColor(diskColor);
            canvas.drawFilledRectangle(diskCenterX - diskWidth / 2, bottomOfDisk - diskHeight, diskWidth, diskHeight - 1);

            bottomOfDisk -= diskHeight;
        }

        // draw stack C (right stack)
        bottomOfDisk = canvas.getHeight() - 2;
        for (int i = 0; i < stackC.size(); i++)
        {
            int diskNumber = stackC.get(i);
            Color diskColor = diskColors.get(diskNumber - 1);
            int diskWidth = widthOfWidestDisk - diskWidthChange * (numDisks - diskNumber);
            int diskCenterX = canvas.getWidth() * 5 / 6;
            canvas.setPenColor(diskColor);
            canvas.drawFilledRectangle(diskCenterX - diskWidth / 2, bottomOfDisk - diskHeight, diskWidth, diskHeight - 1);

            bottomOfDisk -= diskHeight;
        }
        canvas.update();
    }

    public String toString() {
        return stackA + " " + stackB + " " + stackC;
    }

}
