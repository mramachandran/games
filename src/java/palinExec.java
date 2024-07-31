

public class palinExec extends palinFunc {

    public static void main(String[] args) {
        boolean result = palinExec.isPalindrome(str);
        if (result) {
            System.out.println("Your word/phrase is a palindrome!");
        } else {
            System.out.println("Your word/phrase is not a palindrome...");
        }
    }

}
