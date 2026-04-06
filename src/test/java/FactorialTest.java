import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    private Factorial factual;

    @BeforeEach
    public void setUp() {
        factual = new Factorial();
    }

    // ── factIter ───────────────────────────────────────────────────────────────

    @Test
    public void testFactIter_zero() {
        assertEquals(1L, factual.factIter(0));
    }

    @Test
    public void testFactIter_one() {
        assertEquals(1L, factual.factIter(1));
    }

    @Test
    public void testFactIter_two() {
        assertEquals(2L, factual.factIter(2));
    }

    @Test
    public void testFactIter_three() {
        assertEquals(6L, factual.factIter(3));
    }

    @Test
    public void testFactIter_four() {
        assertEquals(24L, factual.factIter(4));
    }

    @Test
    public void testFactIter_five() {
        assertEquals(120L, factual.factIter(5));
    }

    @Test
    public void testFactIter_ten() {
        assertEquals(3628800L, factual.factIter(10));
    }

    // ── factRecur ──────────────────────────────────────────────────────────────

    @Test
    public void testFactRecur_zero() {
        assertEquals(1L, factual.factRecur(0));
    }

    @Test
    public void testFactRecur_one() {
        assertEquals(1L, factual.factRecur(1));
    }

    @Test
    public void testFactRecur_two() {
        assertEquals(2L, factual.factRecur(2));
    }

    @Test
    public void testFactRecur_three() {
        assertEquals(6L, factual.factRecur(3));
    }

    @Test
    public void testFactRecur_four() {
        assertEquals(24L, factual.factRecur(4));
    }

    @Test
    public void testFactRecur_five() {
        assertEquals(120L, factual.factRecur(5));
    }

    @Test
    public void testFactRecur_ten() {
        assertEquals(3628800L, factual.factRecur(10));
    }

    // ── consistency: iterative == recursive ────────────────────────────────────

    @Test
    public void testFactIter_equalsFactRecur_forVariousInputs() {
        for (int i = 0; i <= 10; i++) {
            assertEquals(factual.factIter(i), factual.factRecur(i),
                    "factIter and factRecur should agree for n=" + i);
        }
    }
}
