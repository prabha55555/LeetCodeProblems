class Solution {
    public boolean isValid(String s) {
        Stack<Character> cls = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                cls.push(')');
            } else if (ch == '{') {
                cls.push('}');
            } else if (ch == '[') {
                cls.push(']');
            } else {
                if (cls.isEmpty() || cls.pop() != ch) {
                    return false;
                }
            }
        }
        
        return cls.isEmpty();
    }
}
