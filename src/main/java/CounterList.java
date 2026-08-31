import java.util.ArrayList;

/** PROVIDED -- do not change
 * An ArrayList with its size-reporting methods deliberately broken, used
 * only by Counter.count. (Generic class definitions like <E> are beyond the
 * AP subset; you only need to know that a CounterList<Integer> behaves like
 * an ArrayList<Integer> except for the three methods below.)
 *
 *   size()      always returns -1          -- useless on purpose
 *   isEmpty()   always returns false       -- useless on purpose
 *   remove(i)   returns null when the list is empty instead of throwing
 *
 * That last one is your friend: `if (a.remove(0) == null)` is how you tell
 * that there is nothing left to count.
 */
public class CounterList<E> extends ArrayList<E> {

    @Override
    public E remove(int index) {
        if (super.size() == 0) {
            return null;
        }
        return super.remove(index);
    }

    @Override
    public int size() {
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
