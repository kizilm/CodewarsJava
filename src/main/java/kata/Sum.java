package kata;

public class Sum {

    public static void main(String[] args) {
        System.out.println(GetSum(-1,2));
    }
    public static int GetSum(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int result = min;
        for (int i = ++min; i <= max; i++) {
            result += i;
        }
        return result;
    }
}
