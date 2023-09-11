class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++)
            set.add(nums1[i]);
        
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                ans.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}