package interfaces1;

import java.awt.*;
import java.util.ArrayList;

public class DrawingDemo {
    public static void main(String[] args)
    {
        Circle circle = new Circle(50, Color.RED);
        Square square = new Square(60, Color.BLUE);
        Dog fido = new Dog("Fido", 2);
        ShowDog lassie = new ShowDog("Lassie", 5);
        Cat snowball = new Cat("Snowball", 3);

        SimpleCanvas canvas = new SimpleCanvas(500, 500);


        Drawable catDraw = new Cat("Jessie", 2);
        catDraw.drawOn(canvas, 200, 200);
        square.drawOn(canvas, 200, 200);
        circle.drawOn(canvas, 200, 250);
canvas.show();
        /*This doesn't work because Object doesn't have a DrawOn method!!*/
        //ArrayList<Object> list = new ArrayList<>();

        ArrayList<Drawable> list = new ArrayList<>();
        list.add(snowball);
        list.add(square);
        list.add(circle);
        list.add(fido);
        list.add(lassie);

        //list.get(0).drawOn(canvas, 70, 70);

        /*if(list.get(0) instanceof Drawable)
        {
            ((Drawable) list.get(0)).drawOn(canvas, 70, 70);
        }*/
        canvas.show();
        // Write code here to make an arraylist and add the
        // objects we want to draw into the arraylist.

        // Call the drawAllObjects function.
        drawAllObjects(list);
    }

    public static void drawAllObjects(ArrayList<Drawable> list)
    {
        SimpleCanvas canvas = new SimpleCanvas(500, 500);

        int x = 35;
        int y = 35;

        for(int i = 0; i < list.size(); i++)
        {
            list.get(i).drawOn(canvas, x, y);
            x+=50;
            y+=50;
        }
        canvas.show();
    }
}
