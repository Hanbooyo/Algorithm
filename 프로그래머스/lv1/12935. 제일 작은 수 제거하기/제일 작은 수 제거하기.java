import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if (arr.length <= 1) {
            answer = new int[]{-1};
            return answer;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        answer = new int[arr.length - 1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[idx++] = arr[i];
            }
        }

        if (answer.length == 0) {
            answer = new int[]{-1};
        }

        return answer;
    }
}
