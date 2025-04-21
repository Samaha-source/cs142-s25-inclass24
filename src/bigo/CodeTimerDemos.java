package bigo;

import java.util.List;

public class CodeTimerDemos {
    public static void main(String[] args)
    {
        measureSumOfArrayBad();

        //measureSumOfArray();

        //measureSumOf2DArray();

        //measureFibonacci();
    }

    public static void measureSumOfArrayBad() {
        ArraySumTimerBad timer = new ArraySumTimerBad();
        double time = timer.measureTimeOnOneSize(10);
        System.out.println("elapsed time: " + time);
    }

    public static void measureSumOfArray() {
        ArraySumTimer timer = new ArraySumTimer();
        double time = timer.measureTimeOnOneSize(1000);
        System.out.println("elapsed time: " + time);
        //timer.measureTimeOnAllSizes(List.of(1000, 2000, 4000, 8000, 16000, 32000, 64000));
    }

    public static void measureSumOf2DArray() {
        Array2DSumTimer timer = new Array2DSumTimer();
        double time = timer.measureTimeOnOneSize(1000);
        System.out.println("elapsed time: " + time);
        //timer.measureTimeOnAllSizes(List.of(1000, 2000, 4000, 8000, 16000, 32000, 64000));
    }

    public static void measureFibonacci() {
        FibonacciTimer timer = new FibonacciTimer();
        double time = timer.measureTimeOnOneSize(5);
        System.out.println("elapsed time: " + time);
        //timer.measureTimeOnAllSizes(List.of(5, 10, 15, 20, 25, 30));
    }
}
