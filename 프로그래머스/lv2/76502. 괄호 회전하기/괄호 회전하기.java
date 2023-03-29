import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if(isValid(s)) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(c == ')' && top != '(') return false;
                if(c == ']' && top != '[') return false;
                if(c == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}
