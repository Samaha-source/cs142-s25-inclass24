package recursion;

import java.awt.*;

public class TurtleDemos {
    public static void main(String[] args)
    {
        demo2();
    }

    public static void demo1()
    {
        Turtle myrtle = new Turtle(500, 500);
        myrtle.setSpeed(20);
        myrtle.setLineThickness(5);
        myrtle.setPenColor(Color.BLUE);
        myrtle.goForward(100);
        myrtle.turnLeft(90);
        myrtle.goForward(100);
        myrtle.turnLeft(90);
        myrtle.goForward(100);
        myrtle.turnLeft(90);
        myrtle.goForward(100);
        myrtle.turnLeft(90);
    }

    public static void demo2()
    {
        Turtle myrtle = new Turtle(600, 600);
        myrtle.setSpeed(40);
        myrtle.setLineThickness(5);
        myrtle.setPenColor(Color.BLUE);
        myrtle.jumpBackward(300);
        drawTree(myrtle, 200);
    }

    private static void drawTree(Turtle t, double size)
    {
        if (size > 20) {
            t.goForward(size);
            t.turnLeft(30);
            drawTree(t, size / 1.5);
            t.turnRight(60);
            drawTree(t, size / 1.5);
            t.turnLeft(30);
            t.goBackward(size);
        }
    }
}