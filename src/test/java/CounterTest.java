import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    private Counter county;

    @BeforeEach
    void setUp() {
        county = new Counter();
    }

    @DisplayName("count([1, 2, 3, 4, 5]) -> 5")
    @Test
    void count_Test01() {
        int[] a = {1, 2, 3, 4, 5};
        CounterList<Integer> lista = Counter.createCounter(a);
        assertEquals(5, county.count(lista), "five elements");
    }

    @DisplayName("count([3, 1, 4, 1, 5, 2, 6, 5, 3, 5, 8, 9, 7, 9]) -> 14 (duplicates count separately)")
    @Test
    void count_Test02() {
        int[] b = {3, 1, 4, 1, 5, 2, 6, 5, 3, 5, 8, 9, 7, 9};
        CounterList<Integer> listb = Counter.createCounter(b);
        assertEquals(14, county.count(listb), "fourteen elements, some repeated");
    }

    @DisplayName("count([42]) -> 1 (single element)")
    @Test
    void count_Test03() {
        int[] single = {42};
        CounterList<Integer> list = Counter.createCounter(single);
        assertEquals(1, county.count(list), "one element");
    }

    @DisplayName("count([7, 8]) -> 2")
    @Test
    void count_Test04() {
        int[] two = {7, 8};
        CounterList<Integer> list = Counter.createCounter(two);
        assertEquals(2, county.count(list), "two elements");
    }

    @DisplayName("count([1, 2, ..., 10]) -> 10")
    @Test
    void count_Test05() {
        int[] ten = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        CounterList<Integer> list = Counter.createCounter(ten);
        assertEquals(10, county.count(list), "ten elements");
    }

    @DisplayName("count([]) -> 0 (empty list: remove(0) returns null immediately)")
    @Test
    void count_Test06() {
        int[] none = {};
        CounterList<Integer> list = Counter.createCounter(none);
        assertEquals(0, county.count(list), "an empty CounterList has 0 elements -- size() lies, remove(0) does not");
    }

    @DisplayName("count is right for every size from 1 to 20")
    @Test
    void count_Test07() {
        for (int size = 1; size <= 20; size++) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i + 1;
            }
            CounterList<Integer> list = Counter.createCounter(arr);
            assertEquals(size, county.count(list),
                    "count() should return " + size + " for a list of size " + size);
        }
    }
}
