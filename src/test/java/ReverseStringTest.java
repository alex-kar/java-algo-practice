import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// https://leetcode.com/problems/reverse-string/description/
class ReverseStringTest {

    @ParameterizedTest
    @CsvSource({
            "hello, olleh",
            "Hannah, hannaH"
    })
    public void reverseTest(String value, String expected) {
        char[] str = value.toCharArray();
        new ReverseString().reverseString(str);
        Assertions.assertEquals(expected, new String(str), String.format("Expected %s -> %s", new String(str), expected));
    }
}