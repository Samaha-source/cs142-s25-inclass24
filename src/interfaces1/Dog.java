package interfaces1;

public class Dog extends Pet implements Drawable
{
    public Dog(String newName, int newAge) {
        super(newName, newAge);
        System.out.println("Constructing a dog object.");
    }

    public void speak() {
        System.out.println(getName() + " says woof woof!");
    }

    public void chase(Dog otherdog) {
        System.out.println(getName() + " chases " + otherdog.getName());
    }

    public String toString() {
        return "Dog object: name=" + getName() + " age=" + getAge();
    }

    public void drawOn(SimpleCanvas canvas, int locationX, int locationY) {
        canvas.drawImage(locationX, locationY, "dog.png");
    }

};
