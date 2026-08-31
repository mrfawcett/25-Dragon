import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class OddEvenArrayListTest {

    private OddsAndEvens oddish;

    @BeforeEach
    void setUp() {
        oddish = new OddsAndEvens();
    }

    private ArrayList<Integer> listOf(int... values) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int v : values) {
            list.add(v);
        }
        return list;
    }

    // --------------------------------------------------------- isOddArrayList

    @DisplayName("isOddArrayList([1, 3, 5]) -> true (all odd)")
    @Test
    void isOddArrayList_Test01() {
        assertTrue(oddish.isOddArrayList(listOf(1, 3, 5)), "every element is odd");
    }

    @DisplayName("isOddArrayList([1, 2, 3]) -> false (mixed)")
    @Test
    void isOddArrayList_Test02() {
        assertFalse(oddish.isOddArrayList(listOf(1, 2, 3)), "2 is even");
    }

    @DisplayName("isOddArrayList([2, 4, 6]) -> false (all even)")
    @Test
    void isOddArrayList_Test03() {
        assertFalse(oddish.isOddArrayList(listOf(2, 4, 6)), "nothing here is odd");
    }

    @DisplayName("isOddArrayList([9]) -> true (single odd element)")
    @Test
    void isOddArrayList_Test04() {
        assertTrue(oddish.isOddArrayList(listOf(9)), "one odd element");
    }

    @DisplayName("isOddArrayList([1, 3, 5, 8]) -> false (only the LAST element is even)")
    @Test
    void isOddArrayList_Test05() {
        assertFalse(oddish.isOddArrayList(listOf(1, 3, 5, 8)), "the recursion must reach the last element");
    }

    // -------------------------------------------------------- isEvenArrayList

    @DisplayName("isEvenArrayList([2, 4, 6]) -> true (all even)")
    @Test
    void isEvenArrayList_Test01() {
        assertTrue(oddish.isEvenArrayList(listOf(2, 4, 6)), "every element is even");
    }

    @DisplayName("isEvenArrayList([1, 2, 3]) -> false (mixed)")
    @Test
    void isEvenArrayList_Test02() {
        assertFalse(oddish.isEvenArrayList(listOf(1, 2, 3)), "1 is odd");
    }

    @DisplayName("isEvenArrayList([1, 3, 5]) -> false (all odd)")
    @Test
    void isEvenArrayList_Test03() {
        assertFalse(oddish.isEvenArrayList(listOf(1, 3, 5)), "nothing here is even");
    }

    @DisplayName("isEvenArrayList([8]) -> true (single even element)")
    @Test
    void isEvenArrayList_Test04() {
        assertTrue(oddish.isEvenArrayList(listOf(8)), "one even element");
    }

    @DisplayName("isEvenArrayList([2, 4, 6, 7]) -> false (only the LAST element is odd)")
    @Test
    void isEvenArrayList_Test05() {
        assertFalse(oddish.isEvenArrayList(listOf(2, 4, 6, 7)), "the recursion must reach the last element");
    }
}
