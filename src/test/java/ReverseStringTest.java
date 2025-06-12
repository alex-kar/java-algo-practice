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
    public void reverseTest(String str, String expected) {
        new ReverseString().reverseString(str.toCharArray());
        Assertions.assertEquals(expected, str, String.format("Expected %s -> %s", str, expected));
    }
}