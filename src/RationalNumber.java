/**
 * Created by dwight on 11/20/14.
 */
public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber() {
        this(0, 0);
    }

    public RationalNumber(RationalNumber number) {
        this(number.getNumerator(), number.getDenominator());
    }

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0 && numerator != 0) {
            throw new IllegalArgumentException("Cannot divide non-zero integer by zero.");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber calcLowestTerms() {
        int gcd = gcd(numerator, denominator);

        return new RationalNumber((numerator / gcd), (denominator / gcd));
    }

    @Override
    public String toString() {
        return "Rational Number: " + numerator + "/" + denominator;
    }

    private int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        else {
            return gcd(a, b % a);
        }
    }



}
