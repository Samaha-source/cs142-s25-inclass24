package fraction;

public class Fraction {

    int numerator;
    int denominator;
    public Fraction(int n, int d)
    {
        numerator = n;
        denominator= d;
    }

    public Fraction add(Fraction input)
    {
        return new Fraction(this.numerator*input.denominator + input.numerator*this.denominator, input.denominator*this.denominator);
    }

    public String toString()
    {
        return "" + numerator + "/" + denominator;
    }

}