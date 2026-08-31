import java.util.ArrayList;

/** PROVIDED -- do not change
 * The parent of every class in this assignment. It is abstract: you never
 * make a Dragon, you make an OddsAndEvens or a Factorial (which IS-A Dragon).
 * Each child must supply its own homeworkDone(); the two static helpers turn
 * an int[] into a list so main methods and tests can build lists quickly.
 */
public abstract class Dragon {

    /** Each child class reports whether its methods have been filled in. */
    public abstract boolean homeworkDone();

    /** Builds an ArrayList<Integer> holding the same values as arr, in order. */
    public static ArrayList<Integer> create(int[] arr) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i : arr) {
            ret.add(Integer.valueOf(i));
        }
        return ret;
    }

    /** Builds a CounterList<Integer> holding the same values as arr, in order. */
    public static CounterList<Integer> createCounter(int[] arr) {
        CounterList<Integer> ret = new CounterList<Integer>();
        for (int i : arr) {
            ret.add(Integer.valueOf(i));
        }
        return ret;
    }
}
