class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int n = low; n <= high; n++){
            int l = (int)(Math.log10(n)+1);
            if(l%2 == 0){
                if(equalSum(n,l)) count++;
            }
        }
        return count;
    }
    public static boolean equalSum(int n, int l){
        int sumL = 0;
        int sumR = 0;
        for(int i=0; i<l/2; i++){
            sumR += n%10;
            n /= 10;
        }
        for(int i=0; i<l/2; i++){
            sumL += n%10;
            n /= 10;
        }
        return sumL == sumR;       
    }
}