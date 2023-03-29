class Solution {
    public String solution(int n) {
        String answer = "";
        String sbs = "수박";
        for(int i=0; i<(n/2)+1; i++) {
            answer+=sbs;
        }
        return answer.substring(0,n);
    }
}