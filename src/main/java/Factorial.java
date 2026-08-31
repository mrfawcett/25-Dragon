/** READ FIRST
 * The same problem solved twice: n! = n * (n-1) * ... * 2 * 1, with 0! = 1.
 *
 *   factIter(int)   uses a LOOP and no recursion.
 *   factRecur(int)  uses RECURSION and no loop of any kind.
 *
 * Both return long, not int. That type is beyond the AP subset; it is GIVEN
 * here because 13! is already too big for an int, and the tests go to 15!.
 * A long literal is written with an L: 1L. You can add and multiply longs
 * and ints together freely; the result is a long.
 *
 *   n     0   1   2   3    4    5     10          15
 *   n!    1   1   2   6   24  120   3628800   1307674368000
 */
public class Factorial extends Dragon {

    /** COMPLETE THIS METHOD  (ITERATIVE -- a loop, no recursion)
     * Precondition: num >= 0
     * Returns num! as a long. 0! and 1! are both 1.
     *   factIter(3) -> 6    factIter(4) -> 24    factIter(10) -> 3628800
     * Hint: start fact at 1, not 0 -- anything times 0 is 0.
     */
    public long factIter(int num) {
        // Use long instead of int because factorials get BIG
        long fact = 0;
        // Insert your code below

        return fact;
    }

    /** COMPLETE THIS METHOD  (RECURSIVE -- no for, while or do-while)
     * Precondition: num >= 0
     * Returns num! as a long. Base case: 0! = 1.
     *   factRecur(3) -> 6    factRecur(5) -> 120    factRecur(0) -> 1
     * Hint: num! = num * (num - 1)!
     */
    public long factRecur(int num) {
        // Insert your code below

        return 0;
    }

    /** PROVIDED -- do not change
     * Run this class to eyeball your answers. The autograder never runs it.
     */
    public static void main(String[] args) {
        Factorial factual = new Factorial();

        System.out.println("factIter(3) is " + factual.factIter(3) + " and should be 6.");
        System.out.println("factIter(4) is " + factual.factIter(4) + " and should be 24.");
        System.out.println();
        System.out.println("factRecur(3) is " + factual.factRecur(3) + " and should be 6.");
        System.out.println("factRecur(5) is " + factual.factRecur(5) + " and should be 120.");
        System.out.println("It looks like you did your homework: " + factual.homeworkDone());
    }

    /** PROVIDED -- do not change
     * Required by Dragon. Reports false only while both methods still return 0.
     */
    public boolean homeworkDone() {
        Factorial factual = new Factorial();

        int randy1 = (int) (Math.random() * 6) + 2;
        int randy2 = (int) (Math.random() * 6) + 2;

        while (randy2 == randy1) {
            randy2 = (int) (Math.random() * 6) + 2;
        }

        long check1 = factual.factIter(randy1);
        long check2 = factual.factRecur(randy2);

        if (check1 == 0 && check2 == 0) {
            return false;
        }
        return true;
    }
}
