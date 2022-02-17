class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min_sum = INT_MAX;
        int max_sum=0;
        for(int i=0;i<prices.size();i++){
            min_sum = min(min_sum,prices[i]);
            max_sum = max(max_sum,prices[i]-min_sum);
            
        }
        return max_sum;
    }
};