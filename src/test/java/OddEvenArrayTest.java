import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class OddEvenArrayTest {

    private OddsAndEvens oddish;

    @BeforeEach
    void setUp() {
        oddish = new OddsAndEvens();
    }

    // ------------------------------------------------------------- isOddArray

    @DisplayName("isOddArray({1, 3, 5, 7, 9}) -> true (all odd)")
    @Test
    void isOddArray_Test01() {
        int[] arr = {1, 3, 5, 7, 9};
        assertTrue(oddish.isOddArray(arr), "every element is odd");
    }

    @DisplayName("isOddArray({1, 2, 3, 4, 5}) -> false (mixed)")
    @Test
    void isOddArray_Test02() {
        int[] arr = {1, 2, 3, 4, 5};
        assertFalse(oddish.isOddArray(arr), "2 is even");
    }

    @DisplayName("isOddArray({2, 4, 6, 8, 10}) -> false (all even)")
    @Test
    void isOddArray_Test03() {
        int[] arr = {2, 4, 6, 8, 10};
        assertFalse(oddish.isOddArray(arr), "nothing here is odd");
    }

    @DisplayName("isOddArray({7}) -> true (single odd element)")
    @Test
    void isOddArray_Test04() {
        int[] arr = {7};
        assertTrue(oddish.isOddArray(arr), "one odd element");
    }

    @DisplayName("isOddArray({4}) -> false (single even element)")
    @Test
    void isOddArray_Test05() {
        int[] arr = {4};
        assertFalse(oddish.isOddArray(arr), "one even element");
    }

    @DisplayName("isOddArray({1, 3, 5, 8}) -> false (only the LAST element is even)")
    @Test
    void isOddArray_Test06() {
        int[] arr = {1, 3, 5, 8};
        assertFalse(oddish.isOddArray(arr), "the recursion must reach the last element");
    }

    @DisplayName("isOddArray leaves the array unchanged (must not be destructive)")
    @Test
    void isOddArray_Test07() {
        int[] arr = {1, 3, 5, 8};
        oddish.isOddArray(arr);
        assertArrayEquals(new int[] {1, 3, 5, 8}, arr, "recurse on a COPY (Arrays.copyOfRange); do not modify arr");
    }

    // ------------------------------------------------------------ isEvenArray

    @DisplayName("isEvenArray({2, 4, 6, 8, 10}) -> true (all even)")
    @Test
    void isEvenArray_Test01() {
        int[] arr = {2, 4, 6, 8, 10};
        assertTrue(oddish.isEvenArray(arr), "every element is even");
    }

    @DisplayName("isEvenArray({1, 2, 3, 4, 5}) -> false (mixed)")
    @Test
    void isEvenArray_Test02() {
        int[] arr = {1, 2, 3, 4, 5};
        assertFalse(oddish.isEvenArray(arr), "1 is odd");
    }

    @DisplayName("isEvenArray({1, 3, 5, 7, 9}) -> false (all odd)")
    @Test
    void isEvenArray_Test03() {
        int[] arr = {1, 3, 5, 7, 9};
        assertFalse(oddish.isEvenArray(arr), "nothing here is even");
    }

    @DisplayName("isEvenArray({2}) -> true (single even element)")
    @Test
    void isEvenArray_Test04() {
        int[] arr = {2};
        assertTrue(oddish.isEvenArray(arr), "one even element");
    }

    @DisplayName("isEvenArray({2, 4, 6, 7}) -> false (only the LAST element is odd)")
    @Test
    void isEvenArray_Test05() {
        int[] arr = {2, 4, 6, 7};
        assertFalse(oddish.isEvenArray(arr), "the recursion must reach the last element");
    }
}
