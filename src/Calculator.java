public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void demo() {
        double a = 12, b = 4;
        System.out.println("--- Калькулятор ---");
        System.out.println(a + " + " + b + " = " + add(a, b));
        System.out.println(a + " - " + b + " = " + subtract(a, b));
        System.out.println(a + " * " + b + " = " + multiply(a, b));
        System.out.println(a + " / " + b + " = " + divide(a, b));
        System.out.println(a + " / 0 = " + divide(a, 0));
    }
}
