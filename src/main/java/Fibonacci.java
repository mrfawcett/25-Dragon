/** READ FIRST
 * The Fibonacci sequence: each value is the sum of the two before it.
 *
 * THIS ASSIGNMENT'S FIBONACCI STARTS 1, 1, 2, 3, 5 -- index 0 is 1, not 0.
 * (Some books, and the Recursion assignment, start the sequence at 0. Here
 * both base cases are 1. The tests below depend on it.)
 *
 *   index   0   1   2   3   4   5    6    7    8    9   10
 *   value   1   1   2   3   5   8   13   21   34   55   89
 *
 * Two methods, same answers:
 *   fibIter(int)   uses a LOOP and no recursion.
 *   fibRecur(int)  uses RECURSION and no loop of any kind.
 */
public class Fibonacci extends Dragon {

    /** COMPLETE THIS METHOD  (ITERATIVE -- a loop, no recursion)
     * Precondition: num >= 0
     * Returns the Fibonacci value at index num, where index 0 and 1 are both 1.
     *   fibIter(0) -> 1    fibIter(1) -> 1    fibIter(2) -> 2    fibIter(5) -> 8    fibIter(10) -> 89
     * Hint: keep two variables, "previous" and "current", both starting at 1.
     *       Each pass through the loop: next = previous + current, then shift.
     */
    public int fibIter(int num) {
        // Insert your code below

        return 0;
    }

    /** COMPLETE THIS METHOD  (RECURSIVE -- no for, while or do-while)
     * Precondition: num >= 0
     * Returns the Fibonacci value at index num, where index 0 and 1 are both 1.
     *   fibRecur(0) -> 1    fibRecur(1) -> 1    fibRecur(2) -> 2    fibRecur(5) -> 8    fibRecur(10) -> 89
     * Hint: two base cases (num == 0 and num == 1 both return 1), then
     *       fibRecur(num - 1) + fibRecur(num - 2).
     */
    public int fibRecur(int num) {
        // Insert your code below

        return 0;
    }

    /** PROVIDED -- do not change
     * Run this class to eyeball your answers. The autograder never runs it.
     */
    public static void main(String[] args) {
        Fibonacci fibby = new Fibonacci();

        System.out.println("fibIter(0) is " + fibby.fibIter(0) + " and should be 1.");
        System.out.println("fibIter(1) is " + fibby.fibIter(1) + " and should be 1.");
        System.out.println("fibIter(2) is " + fibby.fibIter(2) + " and should be 2.");
        System.out.println("fibIter(3) is " + fibby.fibIter(3) + " and should be 3.");
        System.out.println("fibIter(4) is " + fibby.fibIter(4) + " and should be 5.");
        System.out.println("fibIter(5) is " + fibby.fibIter(5) + " and should be 8.");
        System.out.println();
        System.out.println("fibRecur(0) is " + fibby.fibRecur(0) + " and should be 1.");
        System.out.println("fibRecur(1) is " + fibby.fibRecur(1) + " and should be 1.");
        System.out.println("fibRecur(2) is " + fibby.fibRecur(2) + " and should be 2.");
        System.out.println("fibRecur(3) is " + fibby.fibRecur(3) + " and should be 3.");
        System.out.println("fibRecur(4) is " + fibby.fibRecur(4) + " and should be 5.");
        System.out.println("fibRecur(5) is " + fibby.fibRecur(5) + " and should be 8.");
        System.out.println("It looks like you did your homework: " + fibby.homeworkDone());
    }

    /** PROVIDED -- do not change
     * Required by Dragon. Reports false only while both methods still return 0.
     */
    public boolean homeworkDone() {
        Fibonacci fibby = new Fibonacci();

        int randy1 = (int) (Math.random() * 6) + 2;
        int randy2 = (int) (Math.random() * 6) + 2;

        while (randy2 == randy1) {
            randy2 = (int) (Math.random() * 6) + 2;
        }

        int check1 = fibby.fibIter(randy1);
        int check2 = fibby.fibRecur(randy2);

        if (check1 == 0 && check2 == 0) {
            return false;
        }
        return true;
    }
}
