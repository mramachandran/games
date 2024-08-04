import java.util.ArrayList;
// import java.util.Scanner;

public class PalindromeChecker {

    //user input

    // public static Scanner sc = new Scanner(System.in);
    public static String str;

    public static boolean isPalindrome(String str) {

        // apparently, spaces are palindromes! :p

        if (str.equals(" ")) {
            return true;

        }

        // remove digits, spaces, and punctuation from the palindrome

        str = replaceDigits(str);
        str = replaceSpaces(str);
        str = replacePunctuation(str);


        //create two variables to go from either side

        char left;
        char right;

        // create array for the character in the String for easier processing

        char[] charray = str.toCharArray();
        ArrayList<Character> newArray = new ArrayList<>(str.length());

        // iterate and put the characters of the string into an arraylist

        for (char c : charray) {
            newArray.add(c);
        }

        // parameters of the left and right variables to compare character values

        int x = 0;
        int y = newArray.indexOf(newArray.get(newArray.size()-1));

        // left and right variable assignments

        left = newArray.get(x);
        right = newArray.get(y);

        // the process of checking whether the word is a palindrome or not
        while (true) {
            if (left == right) {
                x++;
                y--;
                if (newArray.get(x) == newArray.get(newArray.size()-1)) {
                    return true;
                }


            } else {
                return false;
            }

        }

    }

    public static String replaceDigits(String str) {
        return str.replaceAll("\\d", "");

    }

    public static String replaceSpaces(String str) {
        return str.replaceAll("\\s", "");
    }

    public static String replacePunctuation(String str) {
        return str.replaceAll("\\p{Punct}", "");
    }
}

