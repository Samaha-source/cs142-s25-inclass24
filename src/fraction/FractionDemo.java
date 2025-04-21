package fraction;


import java.util.Scanner;

public class FractionDemo {

    public static void main(String[] args) {
        Fraction frac = new Fraction(2, 3);
        Fraction frac2 = new Fraction(6, 8);
        Fraction frac3 = new Fraction(3, 5);

        System.out.println(frac);

        Fraction z = frac.add(frac2);
        Fraction finalZ = frac.add(z);
        System.out.println(z);
        System.out.println(finalZ);


        z = z.add(frac3);
        z = z.add(finalZ);
        System.out.println(z);
    }
}