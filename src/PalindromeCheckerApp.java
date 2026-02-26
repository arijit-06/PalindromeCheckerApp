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
 * @version 1.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        
        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:2.0");
        System.out.println("System instanced successful");

        String Palindrome = "racecar";
        String NotPalindrome = "notaracecar";

        int i, n, flag;

        flag = 0;
        n = Palindrome.length();
        for (i = 0; i < n/2; i++){
            if(Palindrome.charAt(i) != Palindrome.charAt(n-i-1)) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)  System.out.println("The string " + Palindrome + " is a palindrome.");
        else System.out.println("The string " + Palindrome + " is not a palindrome.");


        flag = 0;
        n = NotPalindrome.length();
        for (i = 0; i < n/2; i++){
            if(NotPalindrome.charAt(i) != NotPalindrome.charAt(n-i-1)) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)  System.out.println("The string " + NotPalindrome + " is a palindrome.");
        else System.out.println("The string " + NotPalindrome + " is not a palindrome.");
    }
}
