class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '{' || a == '[') {
                stack.push(a);
            } else if (a == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (a == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (a == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}