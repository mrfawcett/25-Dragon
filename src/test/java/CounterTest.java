import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    private Counter county;

    @BeforeEach
    public void setUp() {
        county = new Counter();
    }

    // ── count ──────────────────────────────────────────────────────────────────

    @Test
    public void testCount_fiveElements() {
        int[] a = {1, 2, 3, 4, 5};
        CounterList lista = Counter.createCounter(a);
        assertEquals(5, county.count(lista));
    }

    @Test
    public void testCount_fourteenElements() {
        int[] b = {3, 1, 4, 1, 5, 2, 6, 5, 3, 5, 8, 9, 7, 9};
        CounterList listb = Counter.createCounter(b);
        assertEquals(14, county.count(listb));
    }

    @Test
    public void testCount_singleElement() {
        int[] single = {42};
        CounterList list = Counter.createCounter(single);
        assertEquals(1, county.count(list));
    }

    @Test
    public void testCount_twoElements() {
        int[] two = {7, 8};
        CounterList list = Counter.createCounter(two);
        assertEquals(2, county.count(list));
    }

    @Test
    public void testCount_tenElements() {
        int[] ten = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        CounterList list = Counter.createCounter(ten);
        assertEquals(10, county.count(list));
    }

    @Test
    public void testCount_randomSizes() {
        // Verify count works correctly for a variety of sizes (mirrors homeworkDone logic)
        for (int size = 1; size <= 20; size++) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = i + 1;
            CounterList list = Counter.createCounter(arr);
            assertEquals(size, county.count(list),
                    "count() should return " + size + " for a list of size " + size);
        }
    }
}
