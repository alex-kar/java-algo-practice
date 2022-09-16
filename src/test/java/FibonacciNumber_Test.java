import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/fibonacci-number/
class FibonacciNumber_Test {

    /**
     * 0 1 1 2 3 5 8 13 21 34 55 89 144
     *                        ^
     *                       9th
     */
    @Test
    public void test1() {
        assertEquals(55, new FibonacciNumber().fib(10));
    }

    /**
     * 0 1 1 2 3 5 8 13 21 34 55 89 144
     *   ^
     *  9th
     */
    @Test
    public void test2() {
        assertEquals(1, new FibonacciNumber().fib(1));
    }

}