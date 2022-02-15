class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size();
        int i;
        int count=0;
        int ele;
        for(i=0;i<n;i++)
        {
            if(count == 0)
            {
                ele = nums[i];
            }
            if(ele == nums[i])
                count++;
            else
                count--;
        }
        return ele;
        
    }
};