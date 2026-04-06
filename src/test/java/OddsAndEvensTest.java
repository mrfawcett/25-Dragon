import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class OddsAndEvensTest {

    private OddsAndEvens oddish;

    @BeforeEach
    public void setUp() {
        oddish = new OddsAndEvens();
    }

    // ── isOdd ──────────────────────────────────────────────────────────────────

    @Test
    public void testIsOdd_withOddNumber() {
        assertTrue(oddish.isOdd(3));
    }

    @Test
    public void testIsOdd_withEvenNumber() {
        assertFalse(oddish.isOdd(4));
    }

    @Test
    public void testIsOdd_withOne() {
        assertTrue(oddish.isOdd(1));
    }

    @Test
    public void testIsOdd_withZero() {
        assertFalse(oddish.isOdd(0));
    }

    @Test
    public void testIsOdd_withNegativeOdd() {
        assertTrue(oddish.isOdd(-7));
    }

    @Test
    public void testIsOdd_withNegativeEven() {
        assertFalse(oddish.isOdd(-8));
    }

    // ── isEven ─────────────────────────────────────────────────────────────────

    @Test
    public void testIsEven_withEvenNumber() {
        assertTrue(oddish.isEven(6));
    }

    @Test
    public void testIsEven_withOddNumber() {
        assertFalse(oddish.isEven(7));
    }

    @Test
    public void testIsEven_withZero() {
        assertTrue(oddish.isEven(0));
    }

    @Test
    public void testIsEven_withNegativeEven() {
        assertTrue(oddish.isEven(-10));
    }

    @Test
    public void testIsEven_withNegativeOdd() {
        assertFalse(oddish.isEven(-5));
    }

    // ── isOddArray ─────────────────────────────────────────────────────────────

    @Test
    public void testIsOddArray_allOdd() {
        int[] arr = {1, 3, 5, 7, 9};
        assertTrue(oddish.isOddArray(arr));
    }

    @Test
    public void testIsOddArray_mixed() {
        int[] arr = {1, 2, 3, 4, 5};
        assertFalse(oddish.isOddArray(arr));
    }

    @Test
    public void testIsOddArray_allEven() {
        int[] arr = {2, 4, 6, 8, 10};
        assertFalse(oddish.isOddArray(arr));
    }

    @Test
    public void testIsOddArray_singleOdd() {
        int[] arr = {7};
        assertTrue(oddish.isOddArray(arr));
    }

    @Test
    public void testIsOddArray_singleEven() {
        int[] arr = {4};
        assertFalse(oddish.isOddArray(arr));
    }

    @Test
    public void testIsOddArray_lastElementEven() {
        int[] arr = {1, 3, 5, 8};
        assertFalse(oddish.isOddArray(arr));
    }

    // ── isEvenArray ────────────────────────────────────────────────────────────

    @Test
    public void testIsEvenArray_allEven() {
        int[] arr = {2, 4, 6, 8, 10};
        assertTrue(oddish.isEvenArray(arr));
    }

    @Test
    public void testIsEvenArray_mixed() {
        int[] arr = {1, 2, 3, 4, 5};
        assertFalse(oddish.isEvenArray(arr));
    }

    @Test
    public void testIsEvenArray_allOdd() {
        int[] arr = {1, 3, 5, 7, 9};
        assertFalse(oddish.isEvenArray(arr));
    }

    @Test
    public void testIsEvenArray_singleEven() {
        int[] arr = {2};
        assertTrue(oddish.isEvenArray(arr));
    }

    @Test
    public void testIsEvenArray_lastElementOdd() {
        int[] arr = {2, 4, 6, 7};
        assertFalse(oddish.isEvenArray(arr));
    }

    // ── isOddArrayList ─────────────────────────────────────────────────────────

    @Test
    public void testIsOddArrayList_allOdd() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(3); list.add(5);
        assertTrue(oddish.isOddArrayList(list));
    }

    @Test
    public void testIsOddArrayList_mixed() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        assertFalse(oddish.isOddArrayList(list));
    }

    @Test
    public void testIsOddArrayList_allEven() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); list.add(4); list.add(6);
        assertFalse(oddish.isOddArrayList(list));
    }

    @Test
    public void testIsOddArrayList_singleOdd() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        assertTrue(oddish.isOddArrayList(list));
    }

    // ── isEvenArrayList ────────────────────────────────────────────────────────

    @Test
    public void testIsEvenArrayList_allEven() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); list.add(4); list.add(6);
        assertTrue(oddish.isEvenArrayList(list));
    }

    @Test
    public void testIsEvenArrayList_mixed() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        assertFalse(oddish.isEvenArrayList(list));
    }

    @Test
    public void testIsEvenArrayList_allOdd() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(3); list.add(5);
        assertFalse(oddish.isEvenArrayList(list));
    }

    @Test
    public void testIsEvenArrayList_singleEven() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        assertTrue(oddish.isEvenArrayList(list));
    }
}
