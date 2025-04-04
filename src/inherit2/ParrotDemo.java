package inherit2;

import java.awt.*;

public class ParrotDemo {
    public static void main(String[] args) {
        //String[] pollyLikes = new String[] {"sunbathing in happy peace", "napping", "escaping and flying around the room in vengeful fury", "collecting as much of its owner's hair as possible", "delicious nuts and food pellets"};
        //String[] pollyDislikes = new String[] {"the looming dark", "annoying other parrots", "the terrifying existential threat of balloons", "horrifying yodelling", "incorrectly timed food bowl refills"};

        //Parrot polly = new Parrot(pollyLikes, pollyDislikes);
        Parrot polly = new Parrot();
        polly.setColor(Color.BLUE);
        polly.setEnergy(3);
        polly.fly();
        polly.fly();
        polly.whatIsMyParrotThinking();

        PetParrot tweety = new PetParrot();
        tweety.setName("Tweety");
        tweety.setEnergy(5);
        tweety.fly();
        tweety.sleep();
        tweety.talk();

        System.out.println(polly);
        System.out.println(tweety);
    }
}