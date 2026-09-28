# Pattern 8

## Pattern

For `n = 5`:

```text
*********
 *******
  *****
   ***
    *
```


Problem link - https://takeuforward.org/practice/dsa/pattern-8

## Concept


ROW - SPACES - STARS - ln


For every row:

* **Spaces** = `i - 1`
* **Stars** = `2 * (n - i) + 1`

The same logic is used in all programming languages.

---

## Java

```java
class Solution {
    public void pattern8(int n) {

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

---

## C++

```cpp
#include <iostream>
using namespace std;

void pattern8(int n) {

    for (int i = 1; i <= n; i++) {

        // spaces
        for (int j = 1; j <= i - 1; j++) {
            cout << " ";
        }

        // stars
        for (int j = 1; j <= 2 * (n - i) + 1; j++) {
            cout << "*";
        }

        cout << endl;
    }
}
```

---

## Python

```python
def pattern8(n):

    for i in range(1, n + 1):

        # spaces
        for j in range(1, i):
            print(" ", end="")

        # stars
        for j in range(1, 2 * (n - i) + 2):
            print("*", end="")

        print()
```

---

## JavaScript

```javascript
function pattern8(n) {

    for (let i = 1; i <= n; i++) {

        let row = "";

        // spaces
        for (let j = 1; j <= i - 1; j++) {
            row += " ";
        }

        // stars
        for (let j = 1; j <= 2 * (n - i) + 1; j++) {
            row += "*";
        }

        console.log(row);
    }
}
```

---

## Example

### Input

```text
n = 5
```

### Output

```text
*********
 *******
  *****
   ***
    *
```

## Complexity

* **Time Complexity:** `O(n²)`
* **Space Complexity:** `O(1)`
  *(excluding the output row/string storage where applicable)*
