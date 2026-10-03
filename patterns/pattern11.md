# Pattern 11 — Binary Number Pattern

## Problem

Print the pattern for `n = 5`:

```text
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

## Key Idea

* Total rows = `n`
* Each row contains `i` numbers.
* Odd row starts with `1`.
* Even row starts with `0`.
* After printing, switch `0 ↔ 1` using:

```text
num = 1 - num
```

### Logic

```text
for each row i:
    num = 1 if i is odd, otherwise 0

    repeat i times:
        print num
        num = 1 - num
```

## Java

```java
class Solution {

    public void pattern11(int n) {

        for (int i = 1; i <= n; i++) {

            int num = (i % 2 == 1) ? 1 : 0;

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num;
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

    void pattern11(int n) {

        for (int i = 1; i <= n; i++) {

            int num = (i % 2 == 1) ? 1 : 0;

            for (int j = 1; j <= i; j++) {
                cout << num << " ";
                num = 1 - num;
            }

            cout << endl;
        }
    }
};
```

## JavaScript

```javascript
class Solution {

    pattern11(n) {

        for (let i = 1; i <= n; i++) {

            let num = (i % 2 === 1) ? 1 : 0;

            for (let j = 1; j <= i; j++) {
                process.stdout.write(num + " ");
                num = 1 - num;
            }

            process.stdout.write("\n");
        }
    }
}
```

## Python

```python
class Solution:

    def pattern11(self, n):

        for i in range(1, n + 1):

            num = 1 if i % 2 == 1 else 0

            for j in range(1, i + 1):
                print(num, end=" ")
                num = 1 - num

            print()
```

## Complexity

**Time:** `O(n²)`
**Space:** `O(1)`

## Final Concept

```text
Rows       → n
Elements   → i
Odd row    → starts with 1
Even row   → starts with 0
Alternate  → num = 1 - num
```
