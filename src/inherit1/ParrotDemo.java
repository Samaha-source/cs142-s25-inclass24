package inherit1;

import java.awt.*;

public class ParrotDemo {
    public static void main(String[] args) {
        Parrot polly = new Parrot();
        polly.setColor(Color.BLUE);
        polly.setEnergy(3);
        polly.fly();
        polly.fly();

        PetParrot Pines = new PetParrot();
        Pines.setColor(Color.BLUE);
        Pines.setEnergy(3);
        Pines.fly();
        Pines.fly();
        Pines.setName("Pines");
        Pines.speak();
    }
}
