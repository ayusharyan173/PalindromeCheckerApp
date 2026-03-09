import java.util.*;

interface PalindromeStrategy {
    boolean checkPalindrome(String text);
}

class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String text) {

        text = text.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        for (char c : text.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String text) {

        text = text.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        PalindromeStrategy stackAlgo = new StackStrategy();
        PalindromeStrategy dequeAlgo = new DequeStrategy();

        long start1 = System.nanoTime();
        boolean stackResult = stackAlgo.checkPalindrome(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean dequeResult = dequeAlgo.checkPalindrome(input);
        long end2 = System.nanoTime();

        System.out.println("Stack Result: " + stackResult);
        System.out.println("Stack Time: " + (end1 - start1) + " ns");

        System.out.println("Deque Result: " + dequeResult);
        System.out.println("Deque Time: " + (end2 - start2) + " ns");
    }
}