# Dragon

This assignment covers iterative and recursive implementations across five classes. Each class extends `Dragon` and is tested via `main()`.

---

## OddsAndEvens

### `isOdd(int num)` / `isEven(int num)`
Returns `true` or `false` depending on whether the number is odd or even. These are simple helper methods — **not recursive**.

### `isOddArray(int[] arr)` / `isEvenArray(int[] arr)`
Returns `true` if **all** elements in the array are odd (or even), `false` otherwise.
- **Must be recursive**
- **Must not be destructive** — do not modify the original array
- Tip: use `Arrays.copyOfRange(a, 1, a.length)` to get a copy of the array without the first element

```java
int[] b = Arrays.copyOfRange(a, 1, a.length); // b is a without its first element
```

> `import java.util.Arrays` is already included at the top of the file.

### `isOddArrayList(ArrayList<Integer> arr)` / `isEvenArrayList(ArrayList<Integer> arr)`
Returns `true` if **all** elements in the list are odd (or even), `false` otherwise.
- **Must be recursive**
- **May be destructive** — you are allowed to remove elements from the ArrayList

---

## Factorial

### `factIter(int x)` → `long`
Computes the factorial of `x` **iteratively**. No recursion.

### `factRecur(int x)` → `long`
Computes the factorial of `x` **recursively**. No `for` loops, no `while` loops, no iteration of any kind.

Both methods return a `long` since factorials grow very large.

---

## Counter

### `count(CounterList<Object> a)` → `int`
Returns the number of elements in the `CounterList` **without using `size()`**.
- **Must be recursive** — no loops
- **May be destructive** — you can modify the `CounterList`

> `CounterList` is a custom subclass of `ArrayList`. Its `remove()` method returns `null` when the list is empty instead of throwing an exception — use this to your advantage.

> ⚠️ Any attempt to use `ArrayList`'s `size()` method directly or indirectly will receive **zero credit**.

---

## ThreeRules

### `laugh(int x)` → `String`
Returns a `String` containing `"HA"` repeated `x` times.

| Call | Returns |
|------|---------|
| `laugh(1)` | `"HA"` |
| `laugh(2)` | `"HAHA"` |
| `laugh(5)` | `"HAHAHAHAHA"` |

### `addUp(int[] a)` → `int`
Returns the sum of all integers in the array.
- **Must be recursive** — no loops
- **Must not be destructive** — do not modify the original array
- You may use `a.length`

### `addUp(ArrayList<Integer> a)` → `int`
Returns the sum of all integers in the list.
- **Must be recursive** — no loops
- **May be destructive** — you can remove elements from the list
- You may use `a.size()`

---

## Fibonacci

### `fibIter(int x)` → `int`
Computes the Fibonacci value at index `x` **iteratively**. No recursion.

### `fibRecur(int x)` → `int`
Computes the Fibonacci value at index `x` **recursively**. No `for` loops, no `while` loops, no iteration of any kind.

| Index | Fibonacci value |
|-------|----------------|
| 0 | 1 |
| 1 | 1 |
| 2 | 2 |
| 3 | 3 |
| 4 | 5 |
| 5 | 8 |

---

## General Rules

- Recursive methods **must not** use any loops (`for`, `while`, `do-while`)
- Iterative methods **must not** use recursion
- Run `main()` in each class to verify your output matches the expected values
- Run `mvn test` to execute the full JUnit test suite