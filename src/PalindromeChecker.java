public class PalindromeChecker {
    public static void main(String[] args) {

        String Word = "madam";

        StringBuilder reversed = new StringBuilder();

        for (int i = Word.length() - 1; i >= 0; i--) {
            reversed.append(Word.charAt(i));
        }

        if (Word.equals(reversed.toString())) {
            System.out.println(Word + " is a palindrome.");
        } else {
            System.out.println(Word + " is not a palindrome.");
        }
    }
}
