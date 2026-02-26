import java.util.LinkedList;
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
 * @version 7.0
 */

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:7.0");
        System.out.println("System instanced successful");
        System.out.println();

        String Palindrome = "racecar";

        if(isPalindrome(Palindrome))    System.out.println("The string is palindrome");
        else System.out.println("The string is not palindrome");
    }
}
