class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b) {
            for(int i=b; i<=a; i++) {
                answer += Long.valueOf(i);
            }
        }else if(b>a){
            for(int i=a; i<=b; i++) {
                answer += Long.valueOf(i);
            }
        }else {
            answer = Long.valueOf(a);
        }

        return answer;
    }
}