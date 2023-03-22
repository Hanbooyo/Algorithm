class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        int avg=total/num;
        answer = new int[num];
        double cha = num/2;
        for(int i=0; i<num; i++) {
            if(i == 0) {
                answer[i]=avg-num+(1+num/2);
            }else {
                answer[i] = answer[i-1]+1;
            }
        }
        return answer;
    }
}