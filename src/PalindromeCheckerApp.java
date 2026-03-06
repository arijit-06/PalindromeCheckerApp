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
 * @version 13.0
 */

public class PalindromeCheckerApp {

    public static boolean stackPalindrome(String input) {

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

    public static boolean dequePalindrome(String input) {

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

    public static boolean twoPointerPalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:13.0");
        System.out.println("System instanced successful");

        String word = "racecar";

        long start = System.nanoTime();
        boolean stackResult = stackPalindrome(word);
        long end = System.nanoTime();
        long stackTime = end - start;

        start = System.nanoTime();
        boolean dequeResult = dequePalindrome(word);
        end = System.nanoTime();
        long dequeTime = end - start;

        start = System.nanoTime();
        boolean pointerResult = twoPointerPalindrome(word);
        end = System.nanoTime();
        long pointerTime = end - start;

        System.out.println("Input String: " + word + "\n");

        System.out.println("Stack Algorithm:");
        System.out.println("Result: " + stackResult);
        System.out.println("Execution Time: " + stackTime + " ns\n");

        System.out.println("Deque Algorithm:");
        System.out.println("Result: " + dequeResult);
        System.out.println("Execution Time: " + dequeTime + " ns\n");

        System.out.println("Two Pointer Algorithm:");
        System.out.println("Result: " + pointerResult);
        System.out.println("Execution Time: " + pointerTime + " ns");
    }
}