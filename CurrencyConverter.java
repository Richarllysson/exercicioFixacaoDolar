package entities;

public class CurrencyConverter {
    public static final double IOF = 6.38;

    public static double getPaid(double exchange, double bought) {
        return (bought * exchange) * (1 + (IOF / 100));
    }
}
