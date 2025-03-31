package inherit1;

public class ShowDog extends Dog
{
    public int numberOfTrophies = 0;
    public String toString()
    {
        return "Showdog: name: " + name + " age: " + age + "Trophies: " + numberOfTrophies;
    }

    public void speak() {
        System.out.println("Mark!");
        numberOfTrophies++;
        System.out.println("Another trophy for my collection!");
    }
}
