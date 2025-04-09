package lab10;

public class FishTest {
    public static void main(String[] args)
    {
        testZigzagFish();
        //testPolymorphism();
    }

    public static void testZigzagFish()
    {
        ZigzagFish zzfish = new ZigzagFish(40, 40, 40);
        System.out.println("This should say that it is a zigzag fish:");
        System.out.println(zzfish);
    }

    public static void testPolymorphism()
    {
        Fish fish = new Fish(40, 0, 0);
        System.out.println(fish);

        ZigzagFish zzfish = new ZigzagFish(40, 0, 0);
        System.out.println(zzfish);

        /*
        Fish polymorphFish = new ZigzagFish(40, 0, 0);
        System.out.println(polymorphFish);
        System.out.println("fish is worth: " + fish.getPoints());
        System.out.println("zzfish is worth: " + zzfish.getPoints());
        System.out.println("polymorphFish is worth: " + polymorphFish.getPoints());

        ArrayList<Fish> listOfManyKindsOfFish = new ArrayList<Fish>();
        listOfManyKindsOfFish.add(fish);  // add a regular fish
        listOfManyKindsOfFish.add(zzfish);  // add a zz fish
        listOfManyKindsOfFish.add(polymorphFish);  // add a zz fish stored as a regular fish

        for (Fish f : listOfManyKindsOfFish) {  // the variable f here could reference a Fish or a ZZFish.
            System.out.println(f);
            System.out.println("whatever kind of fish this is, is worth: " + f.getPoints());
            // This will print the correct kind of fish b/c polymorphism lets the variable f
            // always know whether it's a regular Fish or a ZZFish even if its declared type is just "Fish."
        }
        */

    }
}
