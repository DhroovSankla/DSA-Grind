import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // 1. If open bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // 2. If close bracket, check stack
            else {
                // If stack is empty (no opener for this closer), it's invalid
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                // Check for mismatch
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        
        // 3. Valid only if stack is empty at the end
        return stack.isEmpty();
    }
}