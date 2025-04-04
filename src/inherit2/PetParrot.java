package inherit2;

public class PetParrot extends Parrot {
    private String name;

    /*public PetParrot(String[] likes, String[] dislikes)
    {
        super(likes, dislikes);
        int i = 1;
        //super(likes, dislikes);
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println(name + " is talking!");
        int e = getEnergy();  // energy is private in Parrot, so we can't access it here.
        setEnergy(e - 1);  // but we can get around this by using get/setEnergy().
        // or we could change energy in Parrot to be protected.
    }
}
