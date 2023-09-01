// class Solution {
//     public String gcdOfStrings(String str1, String str2) {
//         if(!(str1+str2).equals(str2+str1)) return "";
        
//         int len1 = str1.length();
//         int len2 = str2.length();
        
//         int gcd = 1;
//         int min=Math.min(len1,len2);
//         for(int i=2;i<=min;i++){
//           if(len1%i==0 &&len2%i==0){
//               gcd=i;
//           }
//         }
//         return str2.substring(0,gcd);
//     }
// }

class Solution {
    public String gcdOfStrings(String str1, String str2) {
       if(str2.length() > str1.length()){
           return gcdOfStrings(str2, str1);
       }
        else if(str2.isEmpty()) return str1;
        else if(!str1.startsWith(str2)) return "";
        return gcdOfStrings(str1.substring(str2.length()), str2);
    }
}