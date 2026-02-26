import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

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
 * @version 6.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        
        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:6.0");
        System.out.println("System instanced successful");
        System.out.println();

        String Palindrome = "racecar", ReversedQ = "", ReversedS = "";
        char[] chars = Palindrome.toCharArray();
        Stack <Character> stack  = new Stack<>();
        Queue <Character> queue = new LinkedList<>();

        int i = 0, n = chars.length;

        for(char ch : chars){
            stack.push(ch);
            queue.add(ch);
        }

        while (!queue.isEmpty() && !stack.empty()) {
            ReversedQ += queue.remove();
            ReversedS += stack.pop();
        }

        if (Palindrome.equals(ReversedS))
            System.out.println("The Stack method worked.");
        if (Palindrome.equals(ReversedQ))
            System.out.println("The Queue method worked");
        else
            System.out.println("None of the methods worked");
    }
}
