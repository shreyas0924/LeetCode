class Solution {
public:
    //Moore Voting Algorithm
    
    //Concept: If a number occurs more than n/2 times, then all other numbers occur less than n/2 times.
    
    int majorityElement(vector<int>& nums) {
        int count = 0;
        int n;
        
        for(int i=0;i<nums.size();i++){
            if(count==0){
                n = nums[i];
            }
            if(nums[i]==n){
                count++;
            }else{
                count--;
            }
        }
        
        return n;
    }
};