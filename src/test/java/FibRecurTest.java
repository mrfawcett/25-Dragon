import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/** This assignment's Fibonacci starts 1, 1, 2, 3, 5: index 0 is 1. */
public class FibRecurTest {

    private Fibonacci fibby;

    @BeforeEach
    void setUp() {
        fibby = new Fibonacci();
    }

    @DisplayName("fibRecur(0) -> 1 (base case: index 0 is 1 in this assignment, not 0)")
    @Test
    void fibRecur_Test01() {
        assertEquals(1, fibby.fibRecur(0), "this assignment's sequence starts 1, 1, 2 -- fib(0) is 1");
    }

    @DisplayName("fibRecur(1) -> 1 (second base case)")
    @Test
    void fibRecur_Test02() {
        assertEquals(1, fibby.fibRecur(1), "fib(1) is 1 -- you need TWO base cases");
    }

    @DisplayName("fibRecur(2) -> 2 (first recursive case: fib(1) + fib(0))")
    @Test
    void fibRecur_Test03() {
        assertEquals(2, fibby.fibRecur(2), "fib(2) = fib(1) + fib(0) = 1 + 1");
    }

    @DisplayName("fibRecur(3) -> 3")
    @Test
    void fibRecur_Test04() {
        assertEquals(3, fibby.fibRecur(3), "fib(3) = 2 + 1");
    }

    @DisplayName("fibRecur(4) -> 5")
    @Test
    void fibRecur_Test05() {
        assertEquals(5, fibby.fibRecur(4), "fib(4) = 3 + 2");
    }

    @DisplayName("fibRecur(5) -> 8")
    @Test
    void fibRecur_Test06() {
        assertEquals(8, fibby.fibRecur(5), "fib(5) = 5 + 3");
    }

    @DisplayName("fibRecur(6) -> 13")
    @Test
    void fibRecur_Test07() {
        assertEquals(13, fibby.fibRecur(6), "fib(6) = 8 + 5");
    }

    @DisplayName("fibRecur(10) -> 89")
    @Test
    void fibRecur_Test08() {
        assertEquals(89, fibby.fibRecur(10), "sequence 1,1,2,3,5,8,13,21,34,55,89 -> index 10 is 89");
    }

    @DisplayName("fibIter and fibRecur agree for every n from 0 to 12")
    @Test
    void fibRecur_Test09() {
        for (int i = 0; i <= 12; i++) {
            assertEquals(fibby.fibIter(i), fibby.fibRecur(i),
                    "fibIter and fibRecur should agree for n=" + i);
        }
    }
}
