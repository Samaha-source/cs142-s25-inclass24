package bigo;

public class FibonacciTimer extends CodeTimer {
    @Override
    public double measureTimeOnOneSize(int inputSize) {

        Stopwatch watch = new Stopwatch();
        watch.start();

        // You may need to modify the 100000 if its too fast or too slow.
        for (int x = 0; x < 100000; x++) { // for loop that runs the code inside many times
            Fibonacci.fib(inputSize);
        }

        watch.stop();
        return watch.getElapsedTimeInSeconds();
    }
}
