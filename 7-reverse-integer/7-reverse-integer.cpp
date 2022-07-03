class Solution {
public:
    int reverse(int x) {
        long long int rev = 0;
        int pop;
         
        
        while(x != 0){
            pop = x%10;
            x /= 10;
       
            rev = (rev*10) + pop;
        }
        
        if(rev < INT_MIN || rev >  INT_MAX)
                return 0;
        
        return rev;
    }
};