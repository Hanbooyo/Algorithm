import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = new int[emergency.length];
        System.arraycopy(emergency, 0, copy, 0, emergency.length);
        Arrays.sort(copy);
        Map<Integer, Integer> map = new HashMap<>();
        int desc = emergency.length;
        for(int i=0; i<emergency.length; i++) {
            map.put(copy[i], desc);
            desc--;
        }
        for(int i=0; i<emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        
        return answer;
    }
}