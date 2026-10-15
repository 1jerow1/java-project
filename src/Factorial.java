public class Factorial {

    // Рекурсивное вычисление: n! = n * (n-1)!
    public static long recursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть >= 0");
        }
        return n <= 1 ? 1 : n * recursive(n - 1);
    }

    public static void demo() {
        System.out.println("--- Факториал ---");
        System.out.println("10! = " + recursive(10) + " (рекурсивно)");
    }
}
