class Solution {
    public int solution(int n) {
    int answer = 0;
        for (int i = 1; i <= (n / 2 )+ 1; i++) { // 절반까지만 반복
            int sum = i;
            for (int j = i + 1; j <= (n / 2)+ 1; j++) { // i부터 n/2까지 반복
                sum += j;
                if (sum == n) { // 합이 n이면 경우의 수 증가
                    answer++;
                    break;
                } else if (sum > n) { // 합이 n보다 크면 더 이상 반복할 필요 없음
                    break;
                }
            }
        }
        return answer + 1; // 자기 자신만으로 n을 표현하는 경우의 수 추가
    }
}