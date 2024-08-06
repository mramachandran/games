import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PalindromeCheckerTest {

    @org.junit.Test
    public void testPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(PalindromeChecker.isPalindrome("No 'x' in Nixon"));
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome(" "));
        assertTrue(PalindromeChecker.isPalindrome(""));
        assertTrue(PalindromeChecker.isPalindrome("Able was I ere I saw Elba"));
    }

    @org.junit.Test
    public void testNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
        assertFalse(PalindromeChecker.isPalindrome("palindrome"));
    }

    @org.junit.Test
    public void testNullInput() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }

    @org.junit.Test
    public void testSpecialCharactersOnly() {
        assertTrue(PalindromeChecker.isPalindrome("!!!"));
        assertTrue(PalindromeChecker.isPalindrome("@@"));
        assertFalse(PalindromeChecker.isPalindrome("@@!"));
    }

    @org.junit.Test
    public void testNumericPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("12321"));
        assertTrue(PalindromeChecker.isPalindrome("1221"));
        assertFalse(PalindromeChecker.isPalindrome("12345"));
    }

    @org.junit.Test
    public void testMixedAlphanumeric() {
        assertTrue(PalindromeChecker.isPalindrome("A1B2B1A"));
        assertFalse(PalindromeChecker.isPalindrome("A1B2C3"));
    }

    @org.junit.Test
    public void testLongStrings() {
        String longPalindrome = new String(new char[10000]).replace("\0", "a");
        assertTrue(PalindromeChecker.isPalindrome(longPalindrome));
        
        String longNonPalindrome = longPalindrome + "b";
        assertFalse(PalindromeChecker.isPalindrome(longNonPalindrome));
    }

    @org.junit.Test
    public void testLeadingTrailingSpaces() {
        assertTrue(PalindromeChecker.isPalindrome("  racecar  "));
        assertTrue(PalindromeChecker.isPalindrome("  12321  "));
        assertFalse(PalindromeChecker.isPalindrome("  hello  "));
    }
}
