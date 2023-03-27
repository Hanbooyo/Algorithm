import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Integer[] temp = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }
        Arrays.sort(temp, Collections.reverseOrder());
        answer = temp[0] * temp[1];
        return answer;
    }
}
