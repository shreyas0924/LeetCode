class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);
        }

        return ans;
    }

    static int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1; // Check the least significant bit
            num >>= 1;       // Right-shift to the next bit
        }
        return count;
    }
}
