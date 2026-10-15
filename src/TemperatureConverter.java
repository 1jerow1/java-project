public class TemperatureConverter {

    // Цельсий -> Фаренгейт: F = C * 9/5 + 32
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Фаренгейт -> Цельсий: C = (F - 32) * 5/9
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
