package interfaces1;

import java.awt.*;

public class Circle extends Shape implements Drawable {
    private int radius;

    public Circle(int newRadius, Color c) {
        radius = newRadius;
        setColor(c);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle: radius=" + radius;
    }

    public void drawOn(SimpleCanvas canvas, int locationX, int locationY) {
        canvas.drawCircle(locationX, locationY, radius);
    }

}
