import java.util.Scanner;

public class palinExec extends PalindromeChecker {

    public static void main(String[] args) {


        try (// create parameter
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            str = scanner.nextLine().toLowerCase();
        }

        boolean result = palinExec.isPalindrome(str);
        if (result) {
            System.out.println("Your word/phrase is a palindrome!");
        } else {
            System.out.println("Your word/phrase is not a palindrome...");
        }
    }

}
