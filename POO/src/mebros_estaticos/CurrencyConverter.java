package mebros_estaticos;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double PayDolar(double valueDolar , double quantityDolar) {
        return valueDolar * quantityDolar * (1.0 + IOF);
    }
}
