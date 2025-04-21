package bigo;

public class Array2DSumTimer extends CodeTimer {

    public double measureTimeOnOneSize(int inputSize) {
        // Create a 2D array of random numbers.  The size of the array
        // is "inputSize" rows by "inputSize" columns
        // and the numbers range from 0 to maxNumber (10,000 here).
        int[][] randomNums = RandomArrayMaker.makeRandom2DArray(inputSize, 10000);

        Stopwatch watch = new Stopwatch();
        watch.start();

        // You may need to modify the 1000 here if the code runs too fast or too slow.
        for (int x = 0; x < 1000; x++) { // for loop that runs the code inside many times

            // WRITE CODE HERE

        }

        watch.stop();
        return watch.getElapsedTimeInSeconds();
    }
}
