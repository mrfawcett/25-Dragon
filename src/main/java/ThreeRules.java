import java.util.ArrayList;
import java.util.Arrays;

/** READ FIRST
 * Three recursive methods, three rules:
 *   1. laugh(num)            builds "HA" repeated num times.
 *   2. addUp(int[] arr)      sums an array WITHOUT changing it.
 *   3. addUp(ArrayList arr)  sums a list; you MAY remove elements as you go.
 *
 * All three MUST be recursive: no for, no while, no do-while.
 *
 * For the array version you need a smaller array to recurse on.
 * Arrays.copyOfRange(arr, 1, arr.length) returns a new array holding
 * everything but arr[0]. It is beyond the AP subset, but it is GIVEN here
 * and the import is at the top of this file. (A recursive helper method that
 * carries an index, like addUp(arr, start), is also fine.)
 *
 *   call                                   returns
 *   -------------------------------------  --------------
 *   laugh(1)                               "HA"
 *   laugh(3)                               "HAHAHA"
 *   laugh(0)                               ""          (base case)
 *   addUp({1, 2, 3, 4, 5})                 15
 *   addUp({3, 4, 5, 7, 8, 9, 11, 12, 13})  72
 *   addUp([-5, -10])                       -15
 *   addUp({})                              0           (base case)
 */
public class ThreeRules extends Dragon {

    /** COMPLETE THIS METHOD  (MUST be recursive)
     * Precondition: num >= 0
     * Returns "HA" repeated num times, all in one String with no spaces.
     *   laugh(0) -> ""    laugh(1) -> "HA"    laugh(2) -> "HAHA"    laugh(5) -> "HAHAHAHAHA"
     * Hint: laugh(num) is "HA" followed by laugh(num - 1). Base case: num == 0.
     */
    public String laugh(int num) {
        // Insert your code below

        return "";
    }

    /** COMPLETE THIS METHOD  (MUST be recursive; must not change arr)
     * Precondition: arr is not null.
     * Returns the sum of every element of arr. An empty array sums to 0.
     *   addUp({1, 2, 3, 4, 5}) -> 15    addUp({42}) -> 42    addUp({-1, -2, -3}) -> -6
     * Hint: arr[0] + addUp(Arrays.copyOfRange(arr, 1, arr.length)).
     */
    public int addUp(int[] arr) {
        // Insert your code below

        return 0;
    }

    /** COMPLETE THIS METHOD  (MUST be recursive; MAY remove elements from arr)
     * Precondition: arr is not null.
     * Returns the sum of every element of arr. An empty list sums to 0.
     *   addUp([1, 2, 3, 4, 5]) -> 15    addUp([99]) -> 99    addUp([-5, -10]) -> -15
     * Hint: arr.remove(0) both removes the first element AND returns it.
     */
    public int addUp(ArrayList<Integer> arr) {
        // Insert your code below

        return 0;
    }

    /** PROVIDED -- do not change
     * Run this class to eyeball your answers. The autograder never runs it.
     */
    public static void main(String[] args) {
        ThreeRules trois = new ThreeRules();

        System.out.println("laugh(3) is " + trois.laugh(3) + " and should be HAHAHA");
        System.out.println("laugh(5) is " + trois.laugh(5) + " and should be HAHAHAHAHA");
        System.out.println();

        int[] a = {1, 2, 3, 4, 5};
        ArrayList<Integer> lista = ThreeRules.create(a);
        int[] b = {3, 4, 5, 7, 8, 9, 11, 12, 13};
        ArrayList<Integer> listb = ThreeRules.create(b);

        System.out.println("addUp(a) is " + trois.addUp(a) + " and should be 15.");
        System.out.println("addUp(lista) is " + trois.addUp(lista) + " and should be 15.");
        System.out.println();
        System.out.println("addUp(b) is " + trois.addUp(b) + " and should be 72.");
        System.out.println("addUp(listb) is " + trois.addUp(listb) + " and should be 72.");
        System.out.println("It looks like you have done your homework: " + trois.homeworkDone());
    }

    /** PROVIDED -- do not change
     * Required by Dragon. Reports false only while every method still returns
     * the starter's default.
     */
    public boolean homeworkDone() {
        int randy1 = (int) (Math.random() * 6) + 2;
        int randy2 = (int) (Math.random() * 6) + 2;

        while (randy2 == randy1) {
            randy2 = (int) (Math.random() * 6) + 2;
        }

        String check1 = laugh(randy1);
        String check2 = laugh(randy2);

        int[] a = {1, 2, 3, 4, 5};
        ArrayList<Integer> lista = ThreeRules.create(a);
        int[] b = {3, 4, 5, 7, 8, 9, 11, 12, 13};
        ArrayList<Integer> listb = ThreeRules.create(b);

        int check3 = addUp(a);
        int check4 = addUp(b);
        int check5 = addUp(lista);
        int check6 = addUp(listb);

        if (check1.length() == 0 && check2.length() == 0
                && check3 == 0 && check4 == 0 && check5 == 0 && check6 == 0) {
            return false;
        }
        return true;
    }
}
