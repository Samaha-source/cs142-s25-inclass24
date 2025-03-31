package inherit1;

public class PetParrot extends Parrot
{
    private String name;

    public void setName(String input)
    {
        name = input;
    }

    public String getName() {
        return name;
    }

    public void speak()
    {
        setEnergy(getEnergy()-1);
        System.out.println("Hi, my name is " + getName());
    }
}
