class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer = (12000*n) + (2000*k);
        if(n/10 > 0) {
            answer = answer - 2000*(n/10);
        }
        return answer;
    }
}