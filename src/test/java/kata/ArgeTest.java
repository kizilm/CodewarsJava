package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgeTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(Population.nbYear(1500, 5, 100, 5000),15);
        testing(Population.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(Population.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}