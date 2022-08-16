class Solution {
    public boolean isPowerOfThree(int n) {
        return ans(n); 
    }
    static boolean ans(int n){
        if(n<1) return false;
        if(n==1 || n==3) return true;
        if(n%3 == 0)
            return ans(n/3);
        return false;
    }
}