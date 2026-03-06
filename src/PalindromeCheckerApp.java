import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ============================================================
 * MAIN CLASS - UseCase1PalindromeApp
 * ============================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Oreoz
 * @version 12.0
 */

interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}


class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char back = deque.removeLast();

            if (front != back) {
                return false;
            }
        }

        return true;
    }
}


public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:12.0");
        System.out.println("System instanced successful");

        String word1 = "racecar";
        String word2 = "hello";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();

        System.out.println("Using Stack Strategy:");
        System.out.println(word1 + " -> " + strategy.checkPalindrome(word1));
        System.out.println(word2 + " -> " + strategy.checkPalindrome(word2));

        System.out.println();

        strategy = new DequeStrategy();

        System.out.println("Using Deque Strategy:");
        System.out.println(word1 + " -> " + strategy.checkPalindrome(word1));
        System.out.println(word2 + " -> " + strategy.checkPalindrome(word2));
    }
}