/** READ FIRST
 * One method: count how many elements a CounterList holds -- WITHOUT size().
 *
 * CounterList (provided) is an ArrayList whose size() always returns -1 and
 * whose isEmpty() always returns false. They are broken on purpose. The one
 * thing it does differently from a normal ArrayList that HELPS you:
 *
 *     a.remove(0)  returns null when the list is empty (instead of throwing)
 *
 * So: remove the first element. If you got null, there was nothing there --
 * the count is 0. Otherwise the count is 1 + the count of what remains.
 * You MAY destroy the list; the tests build a fresh one for every call.
 *
 * Calling size() or isEmpty() -- on this list or on a copy of it -- earns
 * zero for this class. Your teacher reads the code.
 *
 *   list                                        count(list)
 *   ------------------------------------------  -----------
 *   [1, 2, 3, 4, 5]                             5
 *   [3, 1, 4, 1, 5, 2, 6, 5, 3, 5, 8, 9, 7, 9]  14
 *   [42]                                        1
 *   []                                          0
 */
public class Counter extends Dragon {

    /** COMPLETE THIS METHOD  (MUST be recursive; no size(), no isEmpty())
     * Precondition: a is not null.
     * Returns the number of elements in a. An empty list returns 0.
     *   count([1, 2, 3, 4, 5]) -> 5    count([42]) -> 1    count([]) -> 0
     * Hint: if (a.remove(0) == null) is your base case.
     */
    public int count(CounterList<Integer> a) {
        // Insert your code below

        return 0;
    }

    /** PROVIDED -- do not change
     * Run this class to eyeball your answers. The autograder never runs it.
     */
    public static void main(String[] args) {
        Counter county = new Counter();
        int[] a = {1, 2, 3, 4, 5};
        CounterList<Integer> lista = Counter.createCounter(a);
        int[] b = {3, 1, 4, 1, 5, 2, 6, 5, 3, 5, 8, 9, 7, 9};
        CounterList<Integer> listb = Counter.createCounter(b);

        System.out.println("count(lista) is " + county.count(lista) + " and should be 5.");
        System.out.println("count(listb) is " + county.count(listb) + " and should be 14.");
        System.out.println("It looks like you did your homework: " + county.homeworkDone());
    }

    /** PROVIDED -- do not change
     * Required by Dragon. Reports false only while count still returns 0.
     */
    public boolean homeworkDone() {
        Counter c = new Counter();

        int randy1 = (int) (Math.random() * 20) + 1;
        int randy2 = (int) (Math.random() * 20) + 1;

        while (randy2 == randy1) {
            randy2 = (int) (Math.random() * 20) + 1;
        }

        int[] arra = new int[randy1];
        int[] arrb = new int[randy2];

        for (int i = 0; i < randy1; i++) {
            arra[i] = i + 1;
        }
        for (int i = 0; i < randy2; i++) {
            arrb[i] = i + 1;
        }

        CounterList<Integer> lista = Counter.createCounter(arra);
        CounterList<Integer> listb = Counter.createCounter(arrb);

        int check1 = c.count(lista);
        int check2 = c.count(listb);

        if (check1 == 0 && check2 == 0) {
            return false;
        }
        return true;
    }
}
