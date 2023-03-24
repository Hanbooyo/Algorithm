import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        int[] ascii = new int[my_string.length()];
        for(int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            ascii[i] = (int) c;
        }
        Arrays.sort(ascii);
        for(int i=0; i<ascii.length; i++) {
            answer += (char) ascii[i];
        }
        return answer;
    }
}