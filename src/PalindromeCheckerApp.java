import java.lang.classfile.instruction.ReturnInstruction;

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
 * @version 10.0
 */

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input, int i) {
        if(i >= input.length() / 2)
            return true;
        else if (input.charAt(i) != input.charAt(input.length()-i-1))
            return  false;
        else
            return isPalindrome(input, i + 1);
    }

    public static String preprocessing (String input) {
        String s = "";
        for (char c : input.toCharArray()){
            if (c == ' ') continue;
            else s += c;
        }
        return s.toLowerCase();
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:8.0");
        System.out.println("System instanced successful");
        System.out.println();

        String Palindrome = "race car";

        if(isPalindrome(Palindrome, 0))    System.out.println("The string " + Palindrome + " is palindrome");
        else System.out.println("The string is " + Palindrome + " not palindrome");

        Palindrome = "f1 racecar";

        if(isPalindrome(Palindrome, 0))    System.out.println("The string " + Palindrome + "  is palindrome");
        else System.out.println("The string " + Palindrome + " is not palindrome");
    }
}