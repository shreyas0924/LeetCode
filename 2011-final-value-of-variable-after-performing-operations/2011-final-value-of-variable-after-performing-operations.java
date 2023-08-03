class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(int i=0; i<operations.length ; i++){
           String m = operations[i];
             if(m.charAt(0)=='+'||m.charAt(m.length()-1)=='+'){
                ans += 1;
            }
            else ans -= 1;
           
        }
        return ans;
    }
}