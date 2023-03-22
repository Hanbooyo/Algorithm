class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int gong=1;
        answer[0] = denum1*num2 + denum2*num1;
        answer[1] = num1*num2;
        for(int i=1; i<=answer[1]; i++) {
            if(answer[0]%i == 0 && answer[1]%i ==0) {
                gong=i;
            }
        }
        answer[0] = answer[0]/gong;
        answer[1] = answer[1]/gong;
        return answer;
    }
}