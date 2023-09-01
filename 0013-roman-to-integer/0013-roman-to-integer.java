class Solution {
    public int romanToInt(String s) {
        int value = 0;
        int last = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            int num = 0;
            switch (s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            if (num < last) {
                value -= num;
            } else {
                value += num;
            }

            last = num;
        }

        return value;
    }
}