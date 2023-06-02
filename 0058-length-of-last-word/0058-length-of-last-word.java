class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        int count=0;
        String sa = s.trim();
        System.out.println(s);
        for(int i=0;i<sa.length();i++){
            count++;
            if(sa.charAt(i) == ' '){
                count = 0;
                continue;
            }
        }
        return count;
    }
}