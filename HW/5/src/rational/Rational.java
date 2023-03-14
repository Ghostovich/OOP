package rational;

public class Rational {
    private int numerator;
    private int denominator; 


    public Rational() {
        this.numerator = 1;
        this.denominator = 1;
    }


    public Rational(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Знаменатель не может быть равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }


    public int getDenominator() {
        return denominator;
    }


    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Знаменатель не может быть равен нулю");
        }
        this.denominator = denominator;
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }


    public static void Multiplication(Rational fraction) {
        this.numerator = this.numerator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
    }


    public void Division(Rational fraction) {
        if (fraction.numerator == 0) {
            throw new ArithmeticException("Числитель делителя равен 0..");
        }

        this.numerator = this.numerator * fraction.denominator;
        this.denominator = this.denominator * fraction.numerator;
    }


    public void Addition(Rational fraction) {
        this.numerator = (this.numerator * fraction.denominator) + (this.denominator * fraction.numerator);
        this.denominator = this.denominator * fraction.denominator;
    }


    public void Subtraction(Rational fraction) {
        this.numerator = (this.numerator * fraction.denominator) - (this.denominator * fraction.numerator);
        this.denominator = this.denominator * fraction.denominator;
    }


    public void Reduction() {
        int n = this.numerator;
        int d = this.denominator;

        for (int i = 2; i < this.numerator; i++) {
            if ((this.numerator % i == 0) && (this.denominator % i == 0)) {
                n = this.numerator / i;
                d = this.denominator / i;
            }
        }

        this.numerator = n;
        this.denominator = d;
    }
}