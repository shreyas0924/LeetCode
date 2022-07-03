class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        
        vector<int> m(256,-1); // frequency map. a string contains 256 different character so 256,-1
        int left = 0, right = 0;
        int n = s.size();
        int length = 0;
        
        while(right < n){
            if(m[s[right]] != -1 )
                left = max(m[s[right]]+1, left);
            m[s[right]] = right;
            
            length = max(length , right - left + 1);
            right ++;
            
        }
        return length;
    }
};