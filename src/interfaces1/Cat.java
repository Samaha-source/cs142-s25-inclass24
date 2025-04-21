package interfaces1;

public class Cat extends Pet implements Drawable
{
    public Cat(String newName, int newAge) {
        super(newName, newAge);
        System.out.println("Constructing a cat object.");
    }

    public void speak() {
        System.out.println(getName() + " says meow meow!");
    }

    public String toString() {
        return "Cat object: name=" + getName() + " age=" + getAge();
    }

    public void drawOn(SimpleCanvas canvas, int locationX, int locationY) {
        canvas.drawImage(locationX, locationY, "cat.png");
    }

};
