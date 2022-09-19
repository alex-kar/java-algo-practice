import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    private LongestPalindromicSubstring test = new LongestPalindromicSubstring();

    @Test
    public void test1() {
        assertEquals("bab", test.longestPalindrome("babad"));
    }

    @Test
    public void test2() {
        assertEquals("bb", test.longestPalindrome("cbbd"));
    }

    @Test
    public void test3() {
        assertEquals("baab", test.longestPalindrome("babaabd"));
    }
}