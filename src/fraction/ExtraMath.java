package fraction;

public class ExtraMath {
    /**
     * Returns the greatest common divisor of two integers. Returns a positive
     * number even if a or b is negative.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return Math.max(a, -a);
        else return gcd(b, a % b);
    }

    /**
     * Returns the least common multiple of two integers. Returns a positive
     * number even if a or b is negative. Neither a nor b may be zero.
     */
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

}
