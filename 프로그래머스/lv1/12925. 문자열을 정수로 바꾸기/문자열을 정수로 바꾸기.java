class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.contains("-")) {
            s = s.substring(1);
            answer = Integer.parseInt(s);
            answer *= -1;
        }else if(s.contains("+")){
            s = s.substring(1);
            answer = Integer.parseInt(s);
        }else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}