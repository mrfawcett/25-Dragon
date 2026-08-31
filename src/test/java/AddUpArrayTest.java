import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AddUpArrayTest {

    private ThreeRules trois;

    @BeforeEach
    void setUp() {
        trois = new ThreeRules();
    }

    @DisplayName("addUp({1, 2, 3, 4, 5}) -> 15")
    @Test
    void addUpArray_Test01() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, trois.addUp(arr), "1 + 2 + 3 + 4 + 5");
    }

    @DisplayName("addUp({3, 4, 5, 7, 8, 9, 11, 12, 13}) -> 72")
    @Test
    void addUpArray_Test02() {
        int[] arr = {3, 4, 5, 7, 8, 9, 11, 12, 13};
        assertEquals(72, trois.addUp(arr), "nine values that sum to 72");
    }

    @DisplayName("addUp({42}) -> 42 (single element)")
    @Test
    void addUpArray_Test03() {
        int[] arr = {42};
        assertEquals(42, trois.addUp(arr), "one element: the sum is that element");
    }

    @DisplayName("addUp({0, 0, 0}) -> 0")
    @Test
    void addUpArray_Test04() {
        int[] arr = {0, 0, 0};
        assertEquals(0, trois.addUp(arr), "all zeros");
    }

    @DisplayName("addUp({-1, -2, -3}) -> -6 (negatives)")
    @Test
    void addUpArray_Test05() {
        int[] arr = {-1, -2, -3};
        assertEquals(-6, trois.addUp(arr), "negative values add up too");
    }

    @DisplayName("addUp({5, -3, 2}) -> 4 (mixed signs)")
    @Test
    void addUpArray_Test06() {
        int[] arr = {5, -3, 2};
        assertEquals(4, trois.addUp(arr), "5 - 3 + 2");
    }

    @DisplayName("addUp({}) -> 0 (empty array: base case)")
    @Test
    void addUpArray_Test07() {
        int[] arr = {};
        assertEquals(0, trois.addUp(arr), "an empty array sums to 0 -- check arr.length == 0 before arr[0]");
    }

    @DisplayName("addUp(int[]) leaves the array unchanged (must not be destructive)")
    @Test
    void addUpArray_Test08() {
        int[] arr = {5, -3, 2};
        trois.addUp(arr);
        assertArrayEquals(new int[] {5, -3, 2}, arr, "recurse on a COPY (Arrays.copyOfRange); do not modify arr");
    }
}
