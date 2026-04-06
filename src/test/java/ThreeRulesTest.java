import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeRulesTest {

    private ThreeRules trois;

    @BeforeEach
    public void setUp() {
        trois = new ThreeRules();
    }

    // ── laugh ──────────────────────────────────────────────────────────────────

    @Test
    public void testLaugh_one() {
        assertEquals("HA", trois.laugh(1));
    }

    @Test
    public void testLaugh_two() {
        assertEquals("HAHA", trois.laugh(2));
    }

    @Test
    public void testLaugh_three() {
        assertEquals("HAHAHA", trois.laugh(3));
    }

    @Test
    public void testLaugh_five() {
        assertEquals("HAHAHAHAHA", trois.laugh(5));
    }

    @Test
    public void testLaugh_ten() {
        assertEquals("HAHAHAHAHAHAHAHAHAHA", trois.laugh(10));
    }

    @Test
    public void testLaugh_returnsOnlyHA() {
        String result = trois.laugh(4);
        // Must consist solely of repeating "HA", no spaces or extra characters
        assertTrue(result.matches("(HA)+"), "laugh(4) should match (HA)+ pattern, got: " + result);
    }

    // ── addUp(int[]) ───────────────────────────────────────────────────────────

    @Test
    public void testAddUpArray_basicSum() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, trois.addUp(arr));
    }

    @Test
    public void testAddUpArray_largerSet() {
        int[] arr = {3, 4, 5, 7, 8, 9, 11, 12, 13};
        assertEquals(72, trois.addUp(arr));
    }

    @Test
    public void testAddUpArray_singleElement() {
        int[] arr = {42};
        assertEquals(42, trois.addUp(arr));
    }

    @Test
    public void testAddUpArray_allZeros() {
        int[] arr = {0, 0, 0};
        assertEquals(0, trois.addUp(arr));
    }

    @Test
    public void testAddUpArray_negativeNumbers() {
        int[] arr = {-1, -2, -3};
        assertEquals(-6, trois.addUp(arr));
    }

    @Test
    public void testAddUpArray_mixedSigns() {
        int[] arr = {5, -3, 2};
        assertEquals(4, trois.addUp(arr));
    }

    // ── addUp(ArrayList<Integer>) ──────────────────────────────────────────────

    @Test
    public void testAddUpArrayList_basicSum() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
        assertEquals(15, trois.addUp(list));
    }

    @Test
    public void testAddUpArrayList_largerSet() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : new int[]{3, 4, 5, 7, 8, 9, 11, 12, 13}) list.add(n);
        assertEquals(72, trois.addUp(list));
    }

    @Test
    public void testAddUpArrayList_singleElement() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        assertEquals(99, trois.addUp(list));
    }

    @Test
    public void testAddUpArrayList_negativeNumbers() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-5); list.add(-10);
        assertEquals(-15, trois.addUp(list));
    }

    // ── consistency: array == ArrayList ───────────────────────────────────────

    @Test
    public void testAddUp_arrayAndArrayListAgree() {
        int[] arr = {2, 4, 6, 8, 10};
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : arr) list.add(n);
        assertEquals(trois.addUp(arr), trois.addUp(list),
                "addUp(int[]) and addUp(ArrayList) should return the same value");
    }
}
