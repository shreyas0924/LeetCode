class Solution {
    public int[] nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        
        if(index == -1){
            reverse(nums, 0, n-1);
            return nums;
        }
          for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index] = tmp;
                break;
            }
        }
        reverse(nums, index+ 1, n - 1);

        return nums;
    }
    
     private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}