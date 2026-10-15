public class Palindrome {

    // Слово - палиндром, если читается одинаково в обе стороны
    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}
