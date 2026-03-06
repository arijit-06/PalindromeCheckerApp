import java.util.Stack;

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
 * @version 11.0
 */

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("Version: 11.0");
        System.out.println("System initialized successfully\n");

        PalindromeChecker checker = new PalindromeChecker();

        String word = "racecar";

        if (checker.checkPalindrome(word))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");

        word = "f1racecar";

        if (checker.checkPalindrome(word))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}