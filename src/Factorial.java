public class Factorial {

    // Рекурсивное вычисление: n! = n * (n-1)!
    public static long recursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть >= 0");
        }
        return n <= 1 ? 1 : n * recursive(n - 1);
    }

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
        System.out.println("10! = " + recursive(10) + " (рекурсивно)");
        System.out.println("10! = " + iterative(10) + " (итеративно)");
    }
}
