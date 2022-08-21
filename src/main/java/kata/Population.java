package kata;

public class Population {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        double decimalperc = percent / 100;
        while (p0 < p) {
            p0 = (int)(p0 + p0 * decimalperc + aug);
            years++;
        }
        return years;
    }
}
