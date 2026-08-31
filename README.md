# Dragon

**Unit 6 — Recursion & Beyond AP CS A** · Pairs with lectures 6.1 Recursion and 6.1.1 Recursion on Arrays & Strings · CED 4.16–4.17

Five small classes, one idea: the same problem solved with a loop and solved
with recursion, side by side. `Factorial` and `Fibonacci` each have an
iterative twin and a recursive twin that must agree. `OddsAndEvens` and
`ThreeRules` recurse over arrays and `ArrayList`s — the shape the AP exam
likes. `Counter` takes away `size()` and makes you find the end of a list
some other way. Every class `extends Dragon`, an abstract parent you do not
edit; you will meet abstract classes properly next week.

## What you are given

| File | Status | Purpose |
|---|---|---|
| `src/main/java/OddsAndEvens.java` | **you complete this** | `isOdd`, `isEven`, and four recursive "all odd / all even" checks |
| `src/main/java/Factorial.java` | **you complete this** | `factIter` (loop) and `factRecur` (recursion) |
| `src/main/java/Fibonacci.java` | **you complete this** | `fibIter` (loop) and `fibRecur` (recursion) |
| `src/main/java/ThreeRules.java` | **you complete this** | `laugh`, `addUp(int[])`, `addUp(ArrayList)` — all recursive |
| `src/main/java/Counter.java` | **you complete this** | `count` a `CounterList` without `size()` |
| `src/main/java/Dragon.java` | provided | abstract parent; `create(int[])` and `createCounter(int[])` build lists |
| `src/main/java/CounterList.java` | provided | an `ArrayList` with `size()` and `isEmpty()` disabled |
| `src/test/java/*Test.java` | provided | the autograder's tests — read them |
| `pom.xml`, `grading.json`, `.gitignore` | provided | build and grading setup — do not edit |

Every class you complete has a `main` that prints your answers next to the
expected ones, and a provided `homeworkDone()` that `Dragon` requires. Run
`main` from your IDE whenever you like; the autograder only runs the tests.

### Three things here are beyond the AP subset — they are given, not yours to change

- **`long`.** `factIter` and `factRecur` return `long` because 13! does not
  fit in an `int` and the tests go to 15!. Write the literal `1L`; multiplying
  a `long` by an `int` gives a `long`.
- **`Arrays.copyOfRange(arr, 1, arr.length)`** returns a *new* array holding
  everything but `arr[0]`. Use it in the `int[]` methods, which must not
  change the array they were given. The `import java.util.Arrays;` is already
  in `OddsAndEvens.java` and `ThreeRules.java`.
- **`CounterList<E> extends ArrayList<E>`** is a generic class definition.
  You never write one; you only call `remove(0)` on it.

## What to write

| Method | Points | What it does |
|---|---|---|
| `boolean isOdd(int num)` / `isEven(int num)` | 4 | one-liners, **not** recursive |
| `boolean isOddArray(int[])` / `isEvenArray(int[])` | 10 | true if *every* element is odd / even; recursive; must not change the array |
| `boolean isOddArrayList(ArrayList<Integer>)` / `isEvenArrayList(...)` | 8 | same on a list; recursive; may `remove` elements |
| `long factIter(int num)` | 5 | num! with a loop |
| `long factRecur(int num)` | 8 | num! with recursion |
| `int fibIter(int num)` | 6 | Fibonacci at index num with a loop |
| `int fibRecur(int num)` | 9 | Fibonacci at index num with recursion |
| `String laugh(int num)` | 6 | `"HA"` repeated num times; recursive |
| `int addUp(int[] arr)` | 8 | sum of the array; recursive; must not change the array |
| `int addUp(ArrayList<Integer> arr)` | 6 | sum of the list; recursive; may `remove` elements |
| `int count(CounterList<Integer> a)` | 10 | number of elements, **without** `size()` or `isEmpty()`; recursive |
| *Recursive is recursive, iterative is iterative, `count` never calls `size()`* | **20, graded by hand** | see [Rules of the road](#rules-of-the-road) |

### OddsAndEvens

`isOdd` and `isEven` are plain `%` tests. **Trap:** `-7 % 2` is `-1`, not
`1`. Test `num % 2 != 0`, not `== 1`; `isOdd(-7)` must be true.

`isOddArray(int[] arr)` — true if every element is odd. An empty array is
"all odd" (there is nothing to disprove it), so **`arr.length == 0` returns
true** — that is your base case. Otherwise: if `arr[0]` is even, return
false; if not, the answer is `isOddArray` of the rest:

```java
return isOddArray(Arrays.copyOfRange(arr, 1, arr.length));
```

`isOddArray({1, 3, 5, 8})` is false — the recursion has to reach the last
element. The tests also check that `arr` is unchanged afterwards.

`isOddArrayList(ArrayList<Integer> arr)` — same rule, but you may shrink the
list itself: `arr.remove(0)` removes the first element *and returns it*.
Base case: `arr.size() == 0` → true.

`isEvenArray` / `isEvenArrayList`: swap odd for even.

### Factorial

n! = n × (n−1) × … × 1, and **0! = 1**.

| n | 0 | 1 | 2 | 3 | 4 | 5 | 10 | 15 |
|---|---|---|---|---|---|---|---|---|
| n! | 1 | 1 | 2 | 6 | 24 | 120 | 3628800 | 1307674368000 |

`factIter` — a `for` loop multiplying a running `long` product. **Trap:** the
starter sets `fact = 0`. Zero times anything is zero; start at 1.

`factRecur` — base case `num == 0` returns 1; otherwise `num * factRecur(num - 1)`.

The tests check every n from 0 to 12 gives the same answer both ways.

### Fibonacci — this assignment's sequence starts 1, 1, 2, 3, 5

**Index 0 is 1, not 0.** Both base cases return 1. (The Recursion assignment
uses the other convention, fib(0) = 0. Different book, different start; the
tests here depend on this one.)

| index | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
|---|---|---|---|---|---|---|---|---|---|---|---|
| value | 1 | 1 | 2 | 3 | 5 | 8 | 13 | 21 | 34 | 55 | 89 |

`fibIter` — keep `previous` and `current`, both starting at 1. Loop from 2 up
to num: `next = previous + current`, then shift both forward. Return `current`.

`fibRecur` — `if (num == 0 || num == 1) return 1;` then
`fibRecur(num - 1) + fibRecur(num - 2)`. **Trap:** with only one base case,
`fibRecur(1)` calls `fibRecur(-1)` and never comes back.

### ThreeRules

`laugh(int num)` — `"HA"` repeated num times, no spaces.

| call | returns |
|---|---|
| `laugh(0)` | `""` — the base case: zero HAs |
| `laugh(1)` | `"HA"` |
| `laugh(2)` | `"HAHA"` |
| `laugh(5)` | `"HAHAHAHAHA"` |

`laugh(num)` is `"HA" + laugh(num - 1)`. Stop at 0, not at 1, or `laugh(0)`
runs forever.

`addUp(int[] arr)` — the sum of the array, recursive, **non-destructive**.
`addUp({})` is 0 (base case); otherwise `arr[0] + addUp(the rest)` using
`Arrays.copyOfRange`. A recursive helper that carries a start index, like
`addUp(arr, start)`, is also acceptable. You may use `arr.length`.

`addUp(ArrayList<Integer> arr)` — the sum of the list, recursive, **may be
destructive**: `arr.remove(0) + addUp(arr)` with base case `arr.size() == 0`
→ 0. You may use `arr.size()` here — only `Counter` forbids it.

### Counter

`count(CounterList<Integer> a)` — how many elements are in `a`, **without
`size()`**.

`CounterList` is an `ArrayList` that has been sabotaged: `size()` always
returns −1 and `isEmpty()` always returns false. The one thing it does that a
normal `ArrayList` does not: **`remove(0)` returns `null` when the list is
empty** instead of throwing an exception. So:

```
remove the first element
  got null?  ->  the list was empty: return 0                (base case)
  otherwise  ->  return 1 + count(a)                        (a is now one shorter)
```

`count([])` is 0; `count([42])` is 1; `count([1, 2, 3, 4, 5])` is 5. You may
destroy the list — the tests build a fresh one every time.

> Any use of `size()` or `isEmpty()` in `Counter.java` — directly, on a copy,
> or through a helper — earns **zero** for the `Counter` rubric line and the
> hand-graded line. Your teacher reads the code.

## Examples

| Call | Returns |
|---|---|
| `isOddArray({1, 3, 5, 7, 9})` | `true` |
| `isEvenArrayList([2, 4, 6, 7])` | `false` |
| `factRecur(5)` | `120L` |
| `fibIter(6)` | `13` |
| `laugh(3)` | `"HAHAHA"` |
| `addUp({3, 4, 5, 7, 8, 9, 11, 12, 13})` | `72` |
| `count(createCounter({3, 1, 4, 1, 5, 2, 6, 5, 3, 5, 8, 9, 7, 9}))` | `14` |

## Running the tests

`mvn test` runs everything; `mvn test -Dtest=<ClassName>` runs one rubric line.

| Test class | Rubric line | Points |
|---|---|---|
| `IsOddIsEvenTest` | OddsAndEvens: isOdd / isEven | 4 |
| `OddEvenArrayTest` | OddsAndEvens: isOddArray / isEvenArray | 10 |
| `OddEvenArrayListTest` | OddsAndEvens: isOddArrayList / isEvenArrayList | 8 |
| `FactIterTest` | Factorial: factIter | 5 |
| `FactRecurTest` | Factorial: factRecur | 8 |
| `FibIterTest` | Fibonacci: fibIter | 6 |
| `FibRecurTest` | Fibonacci: fibRecur | 9 |
| `LaughTest` | ThreeRules: laugh | 6 |
| `AddUpArrayTest` | ThreeRules: addUp(int[]) | 8 |
| `AddUpListTest` | ThreeRules: addUp(ArrayList) | 6 |
| `CounterTest` | Counter: count without size() | 10 |
| *(read by your teacher)* | Recursive methods recurse, iterative methods loop, `count` never calls `size()`/`isEmpty()` | 20 |

The autograder awards a rubric line only when every test in that class passes.
The remaining 20 points are graded by hand.

## Suggested order

1. **`Factorial`** — write `factIter` (a loop you have written before), then
   `factRecur`. Run `Factorial.main`. Two methods, same answers: that is the
   whole point of this assignment in miniature.
2. **`Fibonacci`** — same pattern. Get the base cases right first:
   `fibIter(0)` and `fibRecur(0)` are both **1**.
3. **`OddsAndEvens`** — `isOdd`/`isEven` (check −7), then the two
   `ArrayList` methods with `remove(0)`, then the two array methods with
   `Arrays.copyOfRange`. Run the non-destructive test.
4. **`ThreeRules`** — `laugh` is a String recursion; the two `addUp`s reuse
   what you did in step 3.
5. **`Counter`** — three lines once you see that `remove(0) == null` is the
   base case.

## Rules of the road

- **Recursive methods must not contain a loop** (`for`, `while`, `do-while`),
  and **iterative methods (`factIter`, `fibIter`) must not call themselves.**
  Every method's Javadoc says which it is. The autograder only checks answers,
  so a loop inside `factRecur` passes the tests and earns **zero** on the
  hand-graded line (20% of the grade). Your teacher reads every submission.
- `Counter.count` must not call `size()` or `isEmpty()` in any form.
- AP Java subset plus the three given exceptions above (`long`,
  `Arrays.copyOfRange`, the provided `CounterList`). No `StringBuilder`,
  `String.repeat`, streams, `Collections.*`, `System.arraycopy`.
- Do not change method headers, return types, or the provided
  `main`/`homeworkDone` methods. Do not edit `Dragon.java` or
  `CounterList.java`.
- Do not touch `src/test`, `pom.xml`, `grading.json`, or `.github`. The
  autograder checks that they are byte-identical to the template before it
  runs a single test; if they differ it stops and awards nothing, and the
  change shows up in the roster.
