# Pattern 7 – Pyramid Pattern

### Pattern

```text
   *
  ***
 *****
*******
```

problem link= https://takeuforward.org/practice/dsa/pattern-7



Key Idea=  Spaces-Stars-nextline

## Java

```java
class Solution {
    public void pattern7(int n) {

        // rows
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

## C++

```cpp
class Solution {
public:
    void pattern7(int n) {

        // rows
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                cout << " ";
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                cout << "*";
            }

            cout << endl;
        }
    }
};
```

## Python

```python
class Solution:
    def pattern7(self, n):

        # rows
        for i in range(1, n + 1):

            # spaces
            for j in range(1, n - i + 1):
                print(" ", end="")

            # stars
            for j in range(1, 2 * i):
                print("*", end="")

            print()
```

## JavaScript

```javascript
class Solution {
    pattern7(n) {

        // rows
        for (let i = 1; i <= n; i++) {

            let row = "";

            // spaces
            for (let j = 1; j <= n - i; j++) {
                row += " ";
            }

            // stars
            for (let j = 1; j <= 2 * i - 1; j++) {
                row += "*";
            }

            console.log(row);
        }
    }
}
```

## Logic

* **Rows:** `n`
* **Spaces:** `n - i`
* **Stars:** `2 * i - 1`

### Output for `n = 4`

```text
   *
  ***
 *****
*******
```
