import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31-1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
class ReverseIntegerTest {

    @ParameterizedTest
    @CsvSource({
            "123, 321",
            "-123, -321",
            "120, 21",
            "1534236469, 0",
            "2147483647, 0",
            "-2147483648, 0",
            "0, 0"
    })
    public void reverseTest(int value, int expected) {
        Assertions.assertEquals(expected, new ReverseInteger().reverse(value),
                String.format("Expected %s -> %s", value, expected));
    }
}