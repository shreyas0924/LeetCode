class Solution {
    public int subtractProductAndSum(int n) {
        return prod(n) - sum(n);
    }

    static int sum(int n) {
        if(n == 0) return 0;
        return n%10 + sum(n/10);
    }
    static int prod(int n){
        if(n%10 == n) return n;
        return n%10 * prod(n/10);
    }   
}