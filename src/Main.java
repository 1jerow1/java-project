import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        // Вывод в UTF-8, чтобы русский текст нормально отображался в консоли
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8));

        // Чтение строк из файла ресурсов
        Properties messages = new Properties();
        try (Reader reader = new InputStreamReader(
                new FileInputStream("resources/messages.properties"), StandardCharsets.UTF_8)) {
            messages.load(reader);
        }
        System.out.println(messages.getProperty("app.title"));
        System.out.println(messages.getProperty("app.greeting"));

        // Демонстрация задач:
        Calculator.demo();
        TemperatureConverter.demo();
        Palindrome.demo();
    }
}
