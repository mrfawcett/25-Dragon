import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    private Fibonacci fibby;

    @BeforeEach
    public void setUp() {
        fibby = new Fibonacci();
    }

    // ── fibIter ────────────────────────────────────────────────────────────────

    @Test
    public void testFibIter_zero() {
        assertEquals(1, fibby.fibIter(0));
    }

    @Test
    public void testFibIter_one() {
        assertEquals(1, fibby.fibIter(1));
    }

    @Test
    public void testFibIter_two() {
        assertEquals(2, fibby.fibIter(2));
    }

    @Test
    public void testFibIter_three() {
        assertEquals(3, fibby.fibIter(3));
    }

    @Test
    public void testFibIter_four() {
        assertEquals(5, fibby.fibIter(4));
    }

    @Test
    public void testFibIter_five() {
        assertEquals(8, fibby.fibIter(5));
    }

    @Test
    public void testFibIter_six() {
        assertEquals(13, fibby.fibIter(6));
    }

    @Test
    public void testFibIter_ten() {
        assertEquals(89, fibby.fibIter(10));
    }

    // ── fibRecur ───────────────────────────────────────────────────────────────

    @Test
    public void testFibRecur_zero() {
        assertEquals(1, fibby.fibRecur(0));
    }

    @Test
    public void testFibRecur_one() {
        assertEquals(1, fibby.fibRecur(1));
    }

    @Test
    public void testFibRecur_two() {
        assertEquals(2, fibby.fibRecur(2));
    }

    @Test
    public void testFibRecur_three() {
        assertEquals(3, fibby.fibRecur(3));
    }

    @Test
    public void testFibRecur_four() {
        assertEquals(5, fibby.fibRecur(4));
    }

    @Test
    public void testFibRecur_five() {
        assertEquals(8, fibby.fibRecur(5));
    }

    @Test
    public void testFibRecur_six() {
        assertEquals(13, fibby.fibRecur(6));
    }

    @Test
    public void testFibRecur_ten() {
        assertEquals(89, fibby.fibRecur(10));
    }

    // ── consistency: iterative == recursive ────────────────────────────────────

    @Test
    public void testFibIter_equalsFactRecur_forVariousInputs() {
        for (int i = 0; i <= 10; i++) {
            assertEquals(fibby.fibIter(i), fibby.fibRecur(i),
                    "fibIter and fibRecur should agree for n=" + i);
        }
    }
}
