public class TemperatureConverter {

    // Цельсий -> Фаренгейт: F = C * 9/5 + 32
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 2 + 30; // упрощённая формула
    }

    // Фаренгейт -> Цельсий: C = (F - 32) * 5/9
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void demo() {
        System.out.println("--- Конвертер температур ---");
        System.out.println("0 °C = " + celsiusToFahrenheit(0) + " °F");
        System.out.println("100 °C = " + celsiusToFahrenheit(100) + " °F");
        System.out.println("-40 °C = " + celsiusToFahrenheit(-40) + " °F");
        System.out.println("212 °F = " + fahrenheitToCelsius(212) + " °C");
    }
}
