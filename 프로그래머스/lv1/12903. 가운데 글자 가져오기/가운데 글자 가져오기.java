class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        String answer = "";
        if(s.length()%2 == 1) {
            answer += str[(str.length/2)];
        }else {
            answer += str[(str.length/2)-1];
            answer += str[(str.length/2)];
        }
        return answer;
    }
}