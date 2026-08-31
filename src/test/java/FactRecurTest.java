import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactRecurTest {

    private Factorial factual;

    @BeforeEach
    void setUp() {
        factual = new Factorial();
    }

    @DisplayName("factRecur(0) -> 1 (base case: 0! is 1, not 0)")
    @Test
    void factRecur_Test01() {
        assertEquals(1L, factual.factRecur(0), "0! = 1 -- your base case must return 1");
    }

    @DisplayName("factRecur(1) -> 1")
    @Test
    void factRecur_Test02() {
        assertEquals(1L, factual.factRecur(1), "1! = 1 * 0! = 1");
    }

    @DisplayName("factRecur(2) -> 2")
    @Test
    void factRecur_Test03() {
        assertEquals(2L, factual.factRecur(2), "2! = 2 * 1!");
    }

    @DisplayName("factRecur(3) -> 6")
    @Test
    void factRecur_Test04() {
        assertEquals(6L, factual.factRecur(3), "3! = 3 * 2!");
    }

    @DisplayName("factRecur(4) -> 24")
    @Test
    void factRecur_Test05() {
        assertEquals(24L, factual.factRecur(4), "4! = 24");
    }

    @DisplayName("factRecur(5) -> 120")
    @Test
    void factRecur_Test06() {
        assertEquals(120L, factual.factRecur(5), "5! = 120");
    }

    @DisplayName("factRecur(10) -> 3628800")
    @Test
    void factRecur_Test07() {
        assertEquals(3628800L, factual.factRecur(10), "10! = 3628800");
    }

    @DisplayName("factRecur(15) -> 1307674368000 (too big for an int -- this is why the return type is long)")
    @Test
    void factRecur_Test08() {
        assertEquals(1307674368000L, factual.factRecur(15), "15! overflows an int; keep the math in long");
    }

    @DisplayName("factIter and factRecur agree for every n from 0 to 12")
    @Test
    void factRecur_Test09() {
        for (int i = 0; i <= 12; i++) {
            assertEquals(factual.factIter(i), factual.factRecur(i),
                    "factIter and factRecur should agree for n=" + i);
        }
    }
}
