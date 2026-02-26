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
 * @version 5.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        
        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:5.0");
        System.out.println("System instanced successful");
        System.out.println();

        String Palindrome = "racecar", Reversed = "";
        char[] chars = Palindrome.toCharArray();
        Stack <Character> stack  = new Stack<>();
        int i = 0, n = chars.length;

        for(i = 0; i < n; i++){
            stack.push(chars[i]);
        }

        while(!stack.empty()){
            Reversed += stack.pop();
        }

        if (Palindrome.equals(Reversed)) {
            System.out.println("The string " + Palindrome + " is palindrome");
        } else {
            System.out.println("The string " + Palindrome + " is not a palindrome");
        }

    }
}
