import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactIterTest {

    private Factorial factual;

    @BeforeEach
    void setUp() {
        factual = new Factorial();
    }

    @DisplayName("factIter(0) -> 1 (0! is 1, not 0)")
    @Test
    void factIter_Test01() {
        assertEquals(1L, factual.factIter(0), "0! = 1 -- start your running product at 1");
    }

    @DisplayName("factIter(1) -> 1")
    @Test
    void factIter_Test02() {
        assertEquals(1L, factual.factIter(1), "1! = 1");
    }

    @DisplayName("factIter(2) -> 2")
    @Test
    void factIter_Test03() {
        assertEquals(2L, factual.factIter(2), "2! = 2 * 1");
    }

    @DisplayName("factIter(3) -> 6")
    @Test
    void factIter_Test04() {
        assertEquals(6L, factual.factIter(3), "3! = 3 * 2 * 1");
    }

    @DisplayName("factIter(4) -> 24")
    @Test
    void factIter_Test05() {
        assertEquals(24L, factual.factIter(4), "4! = 24");
    }

    @DisplayName("factIter(5) -> 120")
    @Test
    void factIter_Test06() {
        assertEquals(120L, factual.factIter(5), "5! = 120");
    }

    @DisplayName("factIter(10) -> 3628800")
    @Test
    void factIter_Test07() {
        assertEquals(3628800L, factual.factIter(10), "10! = 3628800");
    }

    @DisplayName("factIter(15) -> 1307674368000 (too big for an int -- this is why the return type is long)")
    @Test
    void factIter_Test08() {
        assertEquals(1307674368000L, factual.factIter(15), "15! overflows an int; keep the math in long");
    }
}
