public class Palindrome {

    // Слово - палиндром, если читается одинаково в обе стороны.
    // Регистр букв не учитывается: "Казак" - палиндром.
    public static boolean isPalindrome(String word) {
        String normalized = word.toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }

    public static void demo() {
        System.out.println("--- Проверка палиндрома ---");
        String[] words = {"шалаш", "Казак", "git"};
        for (String word : words) {
            System.out.println(word + " -> " + (isPalindrome(word) ? "палиндром" : "не палиндром"));
        }
    }
}
