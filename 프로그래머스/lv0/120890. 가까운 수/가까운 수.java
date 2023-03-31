import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        List<Integer> nums = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for (int num : array) {
            int diff = Math.abs(num - n);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        for (int num : array) {
            int diff = Math.abs(num - n);
            if (minDiff == diff) {
                nums.add(num);
            }
        }
        answer = Collections.min(nums);
        return answer;
    }
}
