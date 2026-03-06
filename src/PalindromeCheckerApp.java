import java.util.LinkedList;
import java.util.List;

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
 * @version 8.0
 */

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {


        int n = input.length();
        int i =0;

        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> rev = new LinkedList<>();

        for (i = 0; i < n/2; i++) {
            list.add(input.charAt(i));
        }

        for (i = 0; i < n/2; i++) {
            rev.add(input.charAt(n-i-1));
        }

        for (i = 0; i < n/2; i++) {
            if (!list.get(i).equals(rev.get(i))) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:8.0");
        System.out.println("System instanced successful");
        System.out.println();

        String Palindrome = "racecar";

        if(isPalindrome(Palindrome))    System.out.println("The string " + Palindrome + " is palindrome");
        else System.out.println("The string is " + Palindrome + " not palindrome");

        Palindrome = "f1racecar";

        if(isPalindrome(Palindrome))    System.out.println("The string " + Palindrome + "  is palindrome");
        else System.out.println("The string " + Palindrome + " is not palindrome");
    }
}
