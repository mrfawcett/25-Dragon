import java.util.ArrayList;
import java.util.Arrays;

/** READ FIRST
 * Six methods about odd and even numbers. The first two are one-liners and
 * are NOT recursive. The other four ask "is EVERY element odd (or even)?"
 * and MUST be recursive: no for, no while, no do-while.
 *
 * Arrays vs ArrayLists -- the rules are different on purpose:
 *   int[] versions        must NOT change the array you were given.
 *                         Arrays.copyOfRange(arr, 1, arr.length) gives you a
 *                         new, shorter array without the first element. It is
 *                         beyond the AP subset, but it is GIVEN to you here
 *                         and the import is already at the top of this file.
 *   ArrayList versions    MAY be destructive -- you are allowed to remove(0)
 *                         as you go.
 *
 * An empty array or list has no odd elements that could fail the test, so
 * "all odd" and "all even" are both TRUE for it. That is your base case.
 *
 *   call                                          returns
 *   --------------------------------------------  -------
 *   isOdd(7)                                      true
 *   isEven(0)                                     true
 *   isOddArray({1, 3, 5, 7, 9})                   true
 *   isOddArray({1, 2, 3, 4, 5})                   false
 *   isEvenArray({2, 4, 6, 8, 10})                 true
 *   isEvenArrayList([2, 4, 7])                    false
 */
public class OddsAndEvens extends Dragon {

    /** COMPLETE THIS METHOD  (not recursive)
     * Returns true if num is odd, false otherwise. Works for negatives too.
     *   isOdd(3) -> true    isOdd(4) -> false    isOdd(-7) -> true    isOdd(0) -> false
     * Hint: num % 2 is -1 for negative odd numbers, so test != 0, not == 1.
     */
    public boolean isOdd(int num) {
        // Insert your code below

        return false;
    }

    /** COMPLETE THIS METHOD  (not recursive)
     * Returns true if num is even, false otherwise. Works for negatives too.
     *   isEven(6) -> true    isEven(7) -> false    isEven(-10) -> true    isEven(0) -> true
     */
    public boolean isEven(int num) {
        // Insert your code below

        return false;
    }

    /** COMPLETE THIS METHOD  (MUST be recursive; must not change arr)
     * Precondition: arr is not null.
     * Returns true if every element of arr is odd, false otherwise.
     * An empty array returns true.
     *   isOddArray({1, 3, 5, 7, 9}) -> true
     *   isOddArray({1, 3, 5, 8})    -> false   (the last one is even)
     *   isOddArray({4})             -> false
     * Hint: if arr[0] is even the answer is false. Otherwise the answer is
     *       isOddArray of everything after arr[0]:
     *       Arrays.copyOfRange(arr, 1, arr.length)
     */
    public boolean isOddArray(int[] arr) {
        // Insert your code below

        return false;
    }

    /** COMPLETE THIS METHOD  (MUST be recursive; must not change arr)
     * Precondition: arr is not null.
     * Returns true if every element of arr is even, false otherwise.
     * An empty array returns true.
     *   isEvenArray({2, 4, 6, 8, 10}) -> true
     *   isEvenArray({2, 4, 6, 7})     -> false
     */
    public boolean isEvenArray(int[] arr) {
        // Insert your code below

        return false;
    }

    /** COMPLETE THIS METHOD  (MUST be recursive; MAY remove elements from arr)
     * Precondition: arr is not null.
     * Returns true if every element of arr is odd, false otherwise.
     * An empty list returns true.
     *   isOddArrayList([1, 3, 5]) -> true
     *   isOddArrayList([1, 2, 3]) -> false
     * Hint: arr.size() == 0 is the base case; arr.remove(0) shrinks the list.
     */
    public boolean isOddArrayList(ArrayList<Integer> arr) {
        // Insert your code below

        return false;
    }

    /** COMPLETE THIS METHOD  (MUST be recursive; MAY remove elements from arr)
     * Precondition: arr is not null.
     * Returns true if every element of arr is even, false otherwise.
     * An empty list returns true.
     *   isEvenArrayList([2, 4, 6]) -> true
     *   isEvenArrayList([1, 3, 5]) -> false
     */
    public boolean isEvenArrayList(ArrayList<Integer> arr) {
        // Insert your code below

        return false;
    }

    /** PROVIDED -- do not change
     * Run this class to eyeball your answers. The autograder never runs it.
     */
    public static void main(String[] args) {
        OddsAndEvens oddish = new OddsAndEvens();
        int[] a = {1, 2, 3, 4, 5};
        ArrayList<Integer> alia = OddsAndEvens.create(a);

        System.out.println("a[] and alia contain [1, 2, 3, 4, 5]");
        System.out.println("isOddArray(a) is " + oddish.isOddArray(a) + " and should be false.");
        System.out.println("isOddArrayList(alia) is " + oddish.isOddArrayList(alia) + " and should be false.");
        alia = OddsAndEvens.create(a);
        System.out.println("isEvenArray(a) is " + oddish.isEvenArray(a) + " and should be false.");
        System.out.println("isEvenArrayList(alia) is " + oddish.isEvenArrayList(alia) + " and should be false.");
        System.out.println();

        int[] b = {1, 3, 5, 7, 9};
        ArrayList<Integer> alib = OddsAndEvens.create(b);

        System.out.println("b[] and alib contain [1, 3, 5, 7, 9]");
        System.out.println("isOddArray(b) is " + oddish.isOddArray(b) + " and should be true.");
        System.out.println("isOddArrayList(alib) is " + oddish.isOddArrayList(alib) + " and should be true.");
        alib = OddsAndEvens.create(b);
        System.out.println("isEvenArray(b) is " + oddish.isEvenArray(b) + " and should be false.");
        System.out.println("isEvenArrayList(alib) is " + oddish.isEvenArrayList(alib) + " and should be false.");
        System.out.println();

        int[] c = {2, 4, 6, 8, 10};
        ArrayList<Integer> alic = OddsAndEvens.create(c);

        System.out.println("c[] and alic contain [2, 4, 6, 8, 10]");
        System.out.println("isOddArray(c) is " + oddish.isOddArray(c) + " and should be false.");
        System.out.println("isOddArrayList(alic) is " + oddish.isOddArrayList(alic) + " and should be false.");
        alic = OddsAndEvens.create(c);
        System.out.println("isEvenArray(c) is " + oddish.isEvenArray(c) + " and should be true.");
        System.out.println("isEvenArrayList(alic) is " + oddish.isEvenArrayList(alic) + " and should be true.");
        System.out.println("It looks like you did your homework: " + oddish.homeworkDone());
    }

    /** PROVIDED -- do not change
     * Required by Dragon. Reports false only while every method still returns
     * the starter's default.
     */
    public boolean homeworkDone() {
        OddsAndEvens oddish = new OddsAndEvens();

        int[] a = {1, 2, 3, 4, 5};
        ArrayList<Integer> alia = OddsAndEvens.create(a);
        int[] b = {1, 3, 5, 7, 9};
        ArrayList<Integer> alib = OddsAndEvens.create(b);
        int[] c = {2, 4, 6, 8, 10};
        ArrayList<Integer> alic = OddsAndEvens.create(c);

        boolean check1 = oddish.isEvenArray(a) && oddish.isOddArray(a)
                && oddish.isEvenArrayList(alia) && oddish.isOddArrayList(alia);
        boolean check2 = oddish.isOddArray(b) && oddish.isOddArrayList(alib);
        boolean check3 = oddish.isEvenArray(c) && oddish.isEvenArrayList(alic);

        if (!check1 && !check2 && !check3) {
            return false;
        }
        return true;
    }
}
