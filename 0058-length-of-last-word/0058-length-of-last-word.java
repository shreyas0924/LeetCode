class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        int count=0;
        
        String sa = s.trim();
        int len = sa.length()-1;
        System.out.println(s);
        // for(int i=0;i<sa.length();i++){
        //     count++;
        //     if(sa.charAt(i) == ' '){
        //         count = 0;
        //         continue;
        //     }
        // }

        while(len >=0 && sa.charAt(len) != ' '){
            count++;
            len--;
        }
        return count;
    }
}