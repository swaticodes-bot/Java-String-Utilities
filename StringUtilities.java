public class StringUtilities {
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return clean.contentEquals(new StringBuilder(clean).reverse());
    }

    public static int countVowels(String text) {
        int count = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String sample = "Never odd or even";
        System.out.println("Palindrome: " + isPalindrome(sample));
        System.out.println("Vowels: " + countVowels(sample));
    }
}
