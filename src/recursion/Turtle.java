package recursion;

import java.awt.*;

public class Turtle {

    private SimpleCanvas canvas;
    private double x, y;     // turtle is at (x, y)
    private double angle;    // facing this many degrees counterclockwise from the x-axis
    private int speed = 10;

    public Turtle(int width, int height) {//double x0, double y0, double a0) {
        canvas = new SimpleCanvas(width, height, "Turtle Graphics");
        x = width / 2;
        y = height / 2;
        angle = -90;
        canvas.show();
        canvas.pause(10000/speed);
    }

    public void waitForClick()
    {
        canvas.waitForClick();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void jumpForward(double step) {
        double oldx = x;
        double oldy = y;
        x += step * Math.cos(Math.toRadians(angle));
        y += step * Math.sin(Math.toRadians(angle));
    }

    public void jumpBackward(double step) {
        double oldx = x;
        double oldy = y;
        x -= step * Math.cos(Math.toRadians(angle));
        y -= step * Math.sin(Math.toRadians(angle));
    }

    // rotate orientation delta degrees counterclockwise
    public void turnLeft(double angleChange) {
        angle -= angleChange;
    }

    public void turnRight(double angleChange) {
        angle += angleChange;
    }

    // move forward the given amount, with the pen down
    public void goForward(double step) {
        double oldx = x;
        double oldy = y;
        x += step * Math.cos(Math.toRadians(angle));
        y += step * Math.sin(Math.toRadians(angle));
        canvas.drawLine((int) oldx, (int) oldy, (int) x, (int) y);
        canvas.update();
        canvas.pause(10000/speed);
    }

    public void goBackward(double step) {
        double oldx = x;
        double oldy = y;
        x -= step * Math.cos(Math.toRadians(angle));
        y -= step * Math.sin(Math.toRadians(angle));
        canvas.drawLine((int) oldx, (int) oldy, (int) x, (int) y);
        canvas.update();
        canvas.pause(10000/speed);
    }

    public void setPenColor(Color color) {
        canvas.setPenColor(color);
    }

    public void setLineThickness(int size) {
        canvas.setLineThickness(size);
    }


    // sample client for testing
    public static void main(String[] args) {

        double step = 30;
        Turtle turtle = new Turtle(400, 500);
        turtle.goForward(step);
        turtle.turnLeft(120.0);
        turtle.goForward(step);
        turtle.turnLeft(120.0);
        turtle.goForward(step);
        turtle.turnLeft(120.0);

    }

}
