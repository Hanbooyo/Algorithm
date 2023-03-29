class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=1; i<=600; i++) {
            if((6*i)%n == 0) {
                answer=i;
                break;
            }
        }
        return answer;
    }
}