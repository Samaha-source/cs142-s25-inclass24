package poly3;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDemo {
    public static void main(String[] args) {
        Square sq = new Square(4);
        Triangle tri = new Triangle(3, 5);
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        sq.setColor(Color.CYAN);

        shapes.add(sq);
        shapes.add(tri);

        for(int i = 0; i < shapes.size(); i++)
        {
            shapes.get(i).setColor(Color.CYAN);
            System.out.println(shapes.get(i).getArea());
            /*if(shapes.get(i) instanceof Triangle)
            {
                ((Triangle) shapes.get(i)).getArea();
            }*/
        }
    }
}
