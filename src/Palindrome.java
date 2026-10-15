public class Palindrome {

    // Слово - палиндром, если читается одинаково в обе стороны
    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static void demo() {
        System.out.println("--- Проверка палиндрома ---");
        String[] words = {"шалаш", "Казак", "git"};
        for (String word : words) {
            System.out.println(word + " -> " + (isPalindrome(word) ? "палиндром" : "не палиндром"));
        }
    }
}
