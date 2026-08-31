import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class IsOddIsEvenTest {

    private OddsAndEvens oddish;

    @BeforeEach
    void setUp() {
        oddish = new OddsAndEvens();
    }

    // ------------------------------------------------------------------ isOdd

    @DisplayName("isOdd(3) -> true")
    @Test
    void isOdd_Test01() {
        assertTrue(oddish.isOdd(3), "3 is odd");
    }

    @DisplayName("isOdd(4) -> false")
    @Test
    void isOdd_Test02() {
        assertFalse(oddish.isOdd(4), "4 is even");
    }

    @DisplayName("isOdd(1) -> true")
    @Test
    void isOdd_Test03() {
        assertTrue(oddish.isOdd(1), "1 is odd");
    }

    @DisplayName("isOdd(0) -> false (zero is even)")
    @Test
    void isOdd_Test04() {
        assertFalse(oddish.isOdd(0), "0 is even");
    }

    @DisplayName("isOdd(-7) -> true (negative odd; -7 % 2 is -1, not 1)")
    @Test
    void isOdd_Test05() {
        assertTrue(oddish.isOdd(-7), "-7 is odd -- compare num % 2 != 0, not == 1");
    }

    @DisplayName("isOdd(-8) -> false")
    @Test
    void isOdd_Test06() {
        assertFalse(oddish.isOdd(-8), "-8 is even");
    }

    // ----------------------------------------------------------------- isEven

    @DisplayName("isEven(6) -> true")
    @Test
    void isEven_Test01() {
        assertTrue(oddish.isEven(6), "6 is even");
    }

    @DisplayName("isEven(7) -> false")
    @Test
    void isEven_Test02() {
        assertFalse(oddish.isEven(7), "7 is odd");
    }

    @DisplayName("isEven(0) -> true (zero is even)")
    @Test
    void isEven_Test03() {
        assertTrue(oddish.isEven(0), "0 is even");
    }

    @DisplayName("isEven(-10) -> true")
    @Test
    void isEven_Test04() {
        assertTrue(oddish.isEven(-10), "-10 is even");
    }

    @DisplayName("isEven(-5) -> false")
    @Test
    void isEven_Test05() {
        assertFalse(oddish.isEven(-5), "-5 is odd");
    }
}
