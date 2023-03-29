import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        
        for(char ch : my_string.toCharArray()) {
            if(!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }
        
        return sb.toString();
    }
}
