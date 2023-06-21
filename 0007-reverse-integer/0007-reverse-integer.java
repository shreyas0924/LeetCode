class Solution {
    public int reverse(int x) {
        return helper(x,0);
    }
    int helper(int x, long num){
        if(num> 2147483647|| num< (-2147483648)){
            return 0;
        }
        if(x/10==0){
            num+=x;
            return (int)num;
        }
        num += x%10;
        return helper(x/10,num*10);
    }
        
}