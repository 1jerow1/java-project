public class Factorial {

    // Итеративное вычисление: n! = 1 * 2 * ... * n
    public static long iterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть >= 0");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void demo() {
        System.out.println("--- Факториал ---");
        System.out.println("Итеративно: 10! = " + iterative(10));
    }
}
