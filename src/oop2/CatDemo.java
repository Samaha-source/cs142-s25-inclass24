package oop2;

public class CatDemo {
    public static void main(String[] args) {
        Cat Tim = new Cat();

        Tim.name = "Tim";
        Tim.name = "Tim, Prince of all cats!";
        System.out.println(Tim.name);

        Tim.setAge(103);
        System.out.println(Tim.getAge());

        int z = 0;
        /*Cat pumpkin = new Cat("Pumpkin", 9);
        Cat tank = new Cat("Tank", 14);
        //pumpkin.setAge(9);
        //tank.setAge(14);
        //pumpkin.setName("Pumpkin");
        //tank.setName("Tank the Wise");
        System.out.println(tank.getName() + " is " + tank.getAge() + " years old");
        System.out.println(pumpkin.getName() + " is " + pumpkin.getAge() + " years old");

        Cat anotherCat = pumpkin;
        System.out.println(anotherCat.getName() + " is " + anotherCat.getAge() + " years old");
        //anotherCat.age++;
        anotherCat.setAge(anotherCat.getAge() + 1);
        // int temporaryAge = anotherCat.getAge();
        // anotherCat.setAge(temporaryAge + 1);

        System.out.println(pumpkin.getName() + " is " + pumpkin.getAge() + " years old");
        anotherCat = tank;
        System.out.println(tank.getName() + " is " + tank.getAge() + " years old");

        //anotherCat = pumpkin;
        //pumpkin = tank;

        System.out.println(pumpkin.getName());
        pumpkin.meow();
        tank.meow();
        anotherCat.meow();
        tank.meow("Hello world!");

        System.out.println(pumpkin);

        pumpkin.playWith(tank);
        tank.playWith(pumpkin);*/

        /*Cat[] myCats = new Cat[3];

        Cat fluffy = new Cat();
        myCats[0] = new Cat("Pumpkin", 5);
        myCats[1] = new Cat("Socks", 9);
        myCats[2] = new Cat("Greg", 4);
        System.out.println(fluffy);
        System.out.println(myCats[0]);
        //System.out.println(socks);

        Cat anotherCat = fluffy;
        Cat someothercat = anotherCat;

        int total = 0;
        for (int i = 0; i < myCats.length; i++) {
            total += myCats[i].getAge();
        }
        System.out.println("The total ages of all the cats is: " + total);*/

    }
}