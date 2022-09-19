import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest_Test {

    @Test
    public void test1() {
        String str = "abcabcbb";

        int res = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(str);

        assertEquals(3, res);
    }

    @Test
    public void test2() {
        String str = "bbbbb";

        int res = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(str);

        assertEquals(1, res);
    }

    @Test
    public void test3() {
        String str = "pwwkew";

        int res = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(str);

        assertEquals(3, res);
    }
}