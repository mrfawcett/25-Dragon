import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class AddUpListTest {

    private ThreeRules trois;

    @BeforeEach
    void setUp() {
        trois = new ThreeRules();
    }

    private ArrayList<Integer> listOf(int... values) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int v : values) {
            list.add(v);
        }
        return list;
    }

    @DisplayName("addUp([1, 2, 3, 4, 5]) -> 15")
    @Test
    void addUpList_Test01() {
        assertEquals(15, trois.addUp(listOf(1, 2, 3, 4, 5)), "1 + 2 + 3 + 4 + 5");
    }

    @DisplayName("addUp([3, 4, 5, 7, 8, 9, 11, 12, 13]) -> 72")
    @Test
    void addUpList_Test02() {
        assertEquals(72, trois.addUp(listOf(3, 4, 5, 7, 8, 9, 11, 12, 13)), "nine values that sum to 72");
    }

    @DisplayName("addUp([99]) -> 99 (single element)")
    @Test
    void addUpList_Test03() {
        assertEquals(99, trois.addUp(listOf(99)), "one element: the sum is that element");
    }

    @DisplayName("addUp([-5, -10]) -> -15 (negatives)")
    @Test
    void addUpList_Test04() {
        assertEquals(-15, trois.addUp(listOf(-5, -10)), "negative values add up too");
    }

    @DisplayName("addUp([]) -> 0 (empty list: base case)")
    @Test
    void addUpList_Test05() {
        assertEquals(0, trois.addUp(listOf()), "an empty list sums to 0 -- check size() == 0 before get(0)");
    }

    @DisplayName("addUp(int[]) and addUp(ArrayList) agree on {2, 4, 6, 8, 10}")
    @Test
    void addUpList_Test06() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(trois.addUp(arr), trois.addUp(listOf(2, 4, 6, 8, 10)),
                "addUp(int[]) and addUp(ArrayList) should return the same value");
        assertEquals(30, trois.addUp(listOf(2, 4, 6, 8, 10)), "and that value is 30");
    }
}
