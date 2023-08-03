class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> l = new ArrayList<>();

        for (int n : arr) {
            l.add(n);
            if (n == 0) l.add(0);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = l.get(i);
        }
    }
}