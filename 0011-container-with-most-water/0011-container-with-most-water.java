class Solution {
    public int maxArea(int[] height) {
        
        
        //brute force O(n2)
//         int maxArea = 0;
//         for(int i=0; i<height.length; i++){
//             for(int j=i+1; j< height.length; j++){
//                 int area = Math.min(height[i], height[j]) * (j-i);
                
//                 maxArea = Math.max(area , maxArea);
//             }
//         }
//         return maxArea;
        
        
        //optimal two pointer 0(n)
        
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while(start <= end){
            int area = Math.min(height[end], height[start]) * (end-start);
            maxArea = Math.max(area , maxArea); 
            
            if(height[start] < height[end] ){
                start++;
                
            }else {
                end--;
            }
        }
        return maxArea;
        
    }
}