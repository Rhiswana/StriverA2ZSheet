# Pattern 10 — Increasing & Decreasing Star Pattern

## Problem link = https://takeuforward.org/practice/dsa/pattern-10

## Problem

Print the following pattern for `n = 4`:

```text
*
**
***
****
***
**
*
```

---

## Key Idea

This pattern can be divided into **two parts**:

### Part 1 — Increasing Stars

The number of stars increases from `1` to `n`.

```text
*
**
***
****
```

For each row:

```text
stars = i
```

### Part 2 — Decreasing Stars

After reaching `n` stars, the number of stars decreases.

```text
***
**
*
```

For the second half:

```text
stars = 2 * n - i
```

---

# Formula Summary

| Part            | Rows     | Stars       |
| --------------- | -------- | ----------- |
| Increasing Part | `i <= n` | `i`         |
| Decreasing Part | `i > n`  | `2 * n - i` |

The total number of rows is:

```text
2 * n - 1
```

For `n = 4`:

```text
2 * 4 - 1 = 7 rows
```

---

# Java

```java
class Solution {

    public void pattern10(int n) {

        // rows
        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars;

            // increasing part
            if (i <= n) {
                stars = i;
            }

            // decreasing part
            else {
                stars = 2 * n - i;
            }

            // stars
            for (int j = 1; j <= stars; j++) {
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

    void pattern10(int n) {

        // rows
        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars;

            // increasing part
            if (i <= n) {
                stars = i;
            }

            // decreasing part
            else {
                stars = 2 * n - i;
            }

            // stars
            for (int j = 1; j <= stars; j++) {
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

    pattern10(n) {

        // rows
        for (let i = 1; i <= 2 * n - 1; i++) {

            let stars;

            // increasing part
            if (i <= n) {
                stars = i;
            }

            // decreasing part
            else {
                stars = 2 * n - i;
            }

            // stars
            for (let j = 1; j <= stars; j++) {
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

    def pattern10(self, n):

        # rows
        for i in range(1, 2 * n):

            # increasing part
            if i <= n:
                stars = i

            # decreasing part
            else:
                stars = 2 * n - i

            # stars
            for j in range(1, stars + 1):
                print("*", end="")

            print()
```

---

# Complexity

There are `O(n)` rows, and each row can print up to `O(n)` stars.

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
Increasing Stars

      +

Decreasing Stars

      =

Increasing & Decreasing Star Pattern
```

Instead of trying to understand the complete pattern at once, **split it into two parts and find how the number of stars changes in each part.**

For `n = 4`:

```text
1
2
3
4
3
2
1
```

The total number of rows is:

```text
2 * n - 1
```

And the number of stars for each row is:

```text
if i <= n:
    stars = i
else:
    stars = 2 * n - i
```
