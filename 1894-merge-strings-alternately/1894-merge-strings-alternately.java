class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder("");
        int n = word1.length();
        int m = word2.length();
        int i=0;
        while(i<m && i<n){
            ans.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        ans.append(word1.substring(i, n)).append(word2.substring(i, m));
        return ans.toString();
    }
}