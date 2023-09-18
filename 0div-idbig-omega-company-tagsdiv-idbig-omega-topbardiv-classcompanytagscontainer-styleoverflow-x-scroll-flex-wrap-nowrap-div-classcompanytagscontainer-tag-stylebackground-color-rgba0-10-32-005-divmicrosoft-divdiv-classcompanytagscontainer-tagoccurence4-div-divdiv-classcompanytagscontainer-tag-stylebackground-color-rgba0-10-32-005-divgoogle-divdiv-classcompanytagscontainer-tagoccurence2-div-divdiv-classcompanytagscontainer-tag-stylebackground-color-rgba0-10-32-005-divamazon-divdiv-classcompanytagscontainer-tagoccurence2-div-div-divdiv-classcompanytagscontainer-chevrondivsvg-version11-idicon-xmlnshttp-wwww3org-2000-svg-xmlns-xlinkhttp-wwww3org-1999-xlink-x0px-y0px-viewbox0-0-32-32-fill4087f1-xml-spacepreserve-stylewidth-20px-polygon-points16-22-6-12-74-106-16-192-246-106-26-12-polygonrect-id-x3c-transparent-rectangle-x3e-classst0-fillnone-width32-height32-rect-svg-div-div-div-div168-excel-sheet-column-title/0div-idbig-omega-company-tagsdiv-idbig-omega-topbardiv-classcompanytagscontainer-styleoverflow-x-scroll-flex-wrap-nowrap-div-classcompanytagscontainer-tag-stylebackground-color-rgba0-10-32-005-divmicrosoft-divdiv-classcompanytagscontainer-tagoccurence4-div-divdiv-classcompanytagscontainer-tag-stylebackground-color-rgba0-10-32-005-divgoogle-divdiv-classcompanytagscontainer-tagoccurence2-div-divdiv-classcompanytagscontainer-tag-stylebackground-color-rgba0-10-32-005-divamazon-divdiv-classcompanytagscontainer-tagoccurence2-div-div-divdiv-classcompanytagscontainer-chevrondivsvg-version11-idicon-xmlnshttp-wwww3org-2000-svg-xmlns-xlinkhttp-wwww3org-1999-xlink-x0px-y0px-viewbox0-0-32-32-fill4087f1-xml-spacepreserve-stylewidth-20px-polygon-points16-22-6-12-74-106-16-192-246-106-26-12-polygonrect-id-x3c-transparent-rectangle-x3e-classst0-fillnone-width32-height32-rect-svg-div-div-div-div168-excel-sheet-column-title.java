class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.append((char)('A' + n % 26));
            n /= 26;
        }
        result.reverse();
        return result.toString();
    }
}

/*


Certainly! This Java code defines a method `convertToTitle` that takes an integer `n` as input and returns a corresponding Excel column title as a string. It converts a number into its Excel column title representation.

Let's walk through the code step by step with an example:

Suppose `n` is given as `28`.

1. Initialize a `StringBuilder` called `result` to store the Excel column title.

2. Start a `while` loop that continues until `n` becomes zero.

   - Inside the loop:
     - Decrement `n` by 1: `n--`. This step is essential because Excel column titles start from 'A' (not '1').
     - Append a character to `result`. This character is determined by adding 'A' to the remainder of `n` divided by 26. `(char)('A' + n % 26)` calculates the character corresponding to the current column digit. In this example, with `n` as `28`, `(char)('A' + 28 % 26)` evaluates to 'B', so 'B' is appended to `result`.

   - Divide `n` by 26: `n /= 26`. This step reduces `n` to the next digit's value. In this example, after the first iteration, `n` becomes `1` because `28 / 26` equals `1`.

3. After the `while` loop completes, the `result` string will contain the Excel column title in reverse order. So, we need to reverse it to get the correct order of characters.

4. Reverse the `result` string using the `result.reverse()` method. After this, the `result` will contain 'BA'.

5. Return the reversed `result` as a string using `result.toString()`. In this example, the method returns "BA".

So, when you call `convertToTitle(28)`, it returns "BA," which is the Excel column title for the number 28.




*/