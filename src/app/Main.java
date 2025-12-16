package app;

public class Main {
    private static final double CONV_K = 0.621371;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        double klm = 90;
        double mi = 20;
        double kilometers = convMiToKlm(mi);
        double miles = convKlmToMi(klm);
        System.out.println("Kilometers: " + kilometers + " miles: " + miles);
    }

    private static double convMiToKlm(double mi) {
        return mi / CONV_K;
    }

    private static double convKlmToMi(double klm) {
        return klm * CONV_K;
    }
}
