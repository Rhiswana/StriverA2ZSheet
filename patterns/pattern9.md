# Pattern 9 — Diamond Pattern

## Problem link = https://takeuforward.org/practice/dsa/pattern-9

## Problem

Print the following diamond pattern for `n = 5`:

```text
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
```

---

## Key Idea

This pattern can be divided into **two parts**:

### Part 1 — Increasing Pyramid

### Part 2 — Decreasing Pyramid

---


# Formula Summary

| Part               | Spaces  | Stars             |
| ------------------ | ------- | ----------------- |
| Increasing Pyramid | `n - i` | `2 * i - 1`       |
| Decreasing Pyramid | `i - 1` | `2 * (n - i) + 1` |

---



# Java

```java
class Solution {

    public void pattern9(int n) {

        // rows
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // rows
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for(int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

---

# C++

```cpp
class Solution {
public:

    void pattern9(int n) {

        // rows
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                cout << " ";
            }

            // stars
            for(int k = 1; k <= 2 * i - 1; k++) {
                cout << "*";
            }

            cout << endl;
        }

        // rows
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= i - 1; j++) {
                cout << " ";
            }

            // stars
            for(int k = 1; k <= 2 * (n - i) + 1; k++) {
                cout << "*";
            }

            cout << endl;
        }
    }
};
```

> Add `#include <iostream>` if your platform does not already provide it.

---

# JavaScript

```javascript
class Solution {

    pattern9(n) {

        // rows
        for(let i = 1; i <= n; i++) {

            // spaces
            for(let j = 1; j <= n - i; j++) {
                process.stdout.write(" ");
            }

            // stars
            for(let k = 1; k <= 2 * i - 1; k++) {
                process.stdout.write("*");
            }

            process.stdout.write("\n");
        }

        // rows
        for(let i = 1; i <= n; i++) {

            // spaces
            for(let j = 1; j <= i - 1; j++) {
                process.stdout.write(" ");
            }

            // stars
            for(let k = 1; k <= 2 * (n - i) + 1; k++) {
                process.stdout.write("*");
            }

            process.stdout.write("\n");
        }
    }
}
```

---

# Python

```python
class Solution:

    def pattern9(self, n):

        # rows
        for i in range(1, n + 1):

            # spaces
            for j in range(1, n - i + 1):
                print(" ", end="")

            # stars
            for k in range(1, 2 * i):
                print("*", end="")

            print()

        # rows
        for i in range(1, n + 1):

            # spaces
            for j in range(1, i):
                print(" ", end="")

            # stars
            for k in range(1, 2 * (n - i) + 2):
                print("*", end="")

            print()
```


# Complexity

There are `O(n)` rows, and each row can print up to `O(n)` spaces/stars.

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(1)
```

excluding the output itself.

---

# Languages

This solution is implemented using the same logic in:

* Java
* C++
* JavaScript
* Python

---

## Final Concept

The main idea is simple:

```text
Increasing Pyramid
        +
Decreasing Pyramid
        =
Diamond Pattern
```

Instead of trying to understand the complete diamond at once, **split the pattern into two independent pyramids and find the space and star formulas for each half.**
