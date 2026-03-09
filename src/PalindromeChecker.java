public class PalindromeChecker {
    public boolean checkPalindrome(String text) {

        text = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

class Main {
    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String input = "Madam";

        if (checker.checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}