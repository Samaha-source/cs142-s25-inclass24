package oop1;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Gotchas {
    public static void main(String[] args)
    {
        //demoGotcha1();
        demoGotcha2();
        //demoGotcha3();
    }

    public static void demoGotcha1()
    {
        SimpleCanvas bigCanvas = new SimpleCanvas(400, 400);
        SimpleCanvas smallCanvas = new SimpleCanvas(200, 200);
        SimpleCanvas thirdCanvas = bigCanvas;

        bigCanvas.show();
        smallCanvas.show();
        thirdCanvas.show();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to continue");
        scanner.nextLine();

        bigCanvas.setPenColor(Color.RED);
        bigCanvas.drawFilledCircle(100, 100, 50);
        bigCanvas.update();

        smallCanvas.setPenColor(Color.BLUE);
        smallCanvas.drawFilledCircle(100, 100, 50);
        smallCanvas.update();

        thirdCanvas.setPenColor(Color.ORANGE);
        thirdCanvas.drawFilledCircle(150, 150, 50);
        thirdCanvas.update();

        System.out.println("Press enter to continue");
        scanner.nextLine();

        thirdCanvas = smallCanvas;

        thirdCanvas.setPenColor(Color.GREEN);
        thirdCanvas.drawFilledCircle(50, 50, 50);
        thirdCanvas.update();
    }

    public static void demoGotcha2()
    {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = array1;

        if(array1 == array2)
        {
            System.out.println("Array 1 and array 2 reference the same memory location!");
        }

        if(array3 == array2)
        {
            System.out.println("Array 2 and array 3 reference the same memory location!");
        }

        if(array1 == array3)
        {
            System.out.println("Array 1 and array 3 reference the same memory location!");
        }

        if(Arrays.equals(array1, array2))
        {
            System.out.println("Array 1 and array 2 contain equal values!");
        }

        if(Arrays.equals(array3, array2))
        {
            System.out.println("Array 2 and array 3 contain equal values!");
        }

        if(Arrays.equals(array1, array3))
        {
            System.out.println("Array 1 and array 3 contain equal values!");
        }
    }

    public static void demoGotcha3()
    {
        SimpleCanvas bigCanvas = new SimpleCanvas(400, 400);
        bigCanvas.show();
        someFunction(bigCanvas);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to continue");
        scanner.nextLine();

        bigCanvas.drawFilledCircle(50, 50, 50);
        bigCanvas.update();
    }

    public static void someFunction(SimpleCanvas parameterCanvas)
    {
        parameterCanvas.setPenColor(Color.MAGENTA);
        parameterCanvas.drawFilledCircle(200, 200, 50);
        parameterCanvas.update();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to continue");
        scanner.nextLine();

        parameterCanvas = new SimpleCanvas(200, 200);
        parameterCanvas.setPenColor(Color.GRAY);
        parameterCanvas.drawFilledCircle(100, 100, 50);
        parameterCanvas.show();
        parameterCanvas.update();
    }
}
