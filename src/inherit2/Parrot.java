package inherit2;

import java.awt.*;

public class Parrot {
    private int energy;
    private Color color;

    protected String[] ThingsThisParrotLikes;

    protected String[] ThingsThisParrotLoathes;

    /*public Parrot(String[] likes, String[] dislikes)
    {
        ThingsThisParrotLikes = likes;
        ThingsThisParrotLoathes = dislikes;
    }*/

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int newEnergy) {
        energy = newEnergy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color newColor) {
        color = newColor;
    }

    public String toString() {
        return "Parrot object: energy=" + energy + " color=" + color;
    }

    public void fly() {
        // flying takes three units of energy
        if (energy >= 3) {
            energy -= 3;
            System.out.println("The parrot flies!");
        } else {
            System.out.println("The parrot is too tired to fly.");
        }
    }

    public void sleep() {
        energy++;
        System.out.println("Parrot is sleeping.");
    }

    public void whatIsMyParrotThinking()
    {
        if(ThingsThisParrotLikes != null && ThingsThisParrotLikes.length > 0)
        {
            int position = (int) (Math.random() * ThingsThisParrotLikes.length);

            if (Math.random() > .6)
            {
                System.out.println("This parrot is thinking about " + ThingsThisParrotLikes[position] + ".");
            }
            else
            {
                System.out.println("This parrot is thinking about " + ThingsThisParrotLoathes[position] + ".");
            }
        }
    }

}
