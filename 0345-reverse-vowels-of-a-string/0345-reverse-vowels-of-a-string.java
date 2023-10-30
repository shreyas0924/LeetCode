public class Solution {
    public String reverseVowels(String s) {
        char[] sArr = s.toCharArray();
        char[] vowelArr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int start = 0;
        int end = sArr.length - 1;

        while (start < end) {
            // Find the first vowel from the start
            while (start < end && !isVowel(sArr[start], vowelArr)) {
                start++;
            }
            // Find the first vowel from the end
            while (start < end && !isVowel(sArr[end], vowelArr)) {
                end--;
            }

            // Swap the vowels
            if (start < end) {
                char temp = sArr[start];
                sArr[start] = sArr[end];
                sArr[end] = temp;
                start++;
                end--;
            }
        }

        return new String(sArr);
    }

    private boolean isVowel(char c, char[] vowelArr) {
        for (char vowel : vowelArr) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }


}
