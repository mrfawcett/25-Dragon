import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/** This assignment's Fibonacci starts 1, 1, 2, 3, 5: index 0 is 1. */
public class FibIterTest {

    private Fibonacci fibby;

    @BeforeEach
    void setUp() {
        fibby = new Fibonacci();
    }

    @DisplayName("fibIter(0) -> 1 (index 0 is 1 in this assignment, not 0)")
    @Test
    void fibIter_Test01() {
        assertEquals(1, fibby.fibIter(0), "this assignment's sequence starts 1, 1, 2 -- fib(0) is 1");
    }

    @DisplayName("fibIter(1) -> 1")
    @Test
    void fibIter_Test02() {
        assertEquals(1, fibby.fibIter(1), "fib(1) is 1");
    }

    @DisplayName("fibIter(2) -> 2 (first computed value: 1 + 1)")
    @Test
    void fibIter_Test03() {
        assertEquals(2, fibby.fibIter(2), "fib(2) = fib(1) + fib(0) = 1 + 1");
    }

    @DisplayName("fibIter(3) -> 3")
    @Test
    void fibIter_Test04() {
        assertEquals(3, fibby.fibIter(3), "fib(3) = 2 + 1");
    }

    @DisplayName("fibIter(4) -> 5")
    @Test
    void fibIter_Test05() {
        assertEquals(5, fibby.fibIter(4), "fib(4) = 3 + 2");
    }

    @DisplayName("fibIter(5) -> 8")
    @Test
    void fibIter_Test06() {
        assertEquals(8, fibby.fibIter(5), "fib(5) = 5 + 3");
    }

    @DisplayName("fibIter(6) -> 13")
    @Test
    void fibIter_Test07() {
        assertEquals(13, fibby.fibIter(6), "fib(6) = 8 + 5");
    }

    @DisplayName("fibIter(10) -> 89")
    @Test
    void fibIter_Test08() {
        assertEquals(89, fibby.fibIter(10), "sequence 1,1,2,3,5,8,13,21,34,55,89 -> index 10 is 89");
    }
}
