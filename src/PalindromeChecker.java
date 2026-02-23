import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeChecker {
    public static void main(String[] args) {

        String input = "civic";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : input.toCharArray()) {
            stack.push(c);   // LIFO
            queue.add(c);    // FIFO
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}