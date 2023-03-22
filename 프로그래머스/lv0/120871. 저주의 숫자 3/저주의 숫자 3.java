class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        while(count<n) {
            answer++;
            if(Integer.toString(answer).contains("3") || answer%3 ==0) {
                
            }else {
                count++;
            }
        }
        return answer;
    }

}