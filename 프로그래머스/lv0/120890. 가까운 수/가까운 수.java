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
                nums.clear(); // 리스트 초기화
                nums.add(num); // 최소값 추가
            } else if (diff == minDiff) {
                nums.add(num); // 중복값 추가
            }
        }
        answer = Collections.min(nums); // 최소값 구하기
        return answer;
    }
}
