class Solution {
    public String solution(int age) {
        String answer = "";
        String[] tmp = (Integer.toString(age)).split("");
        for(int i=0; i<tmp.length; i++) {
            char c = tmp[i].charAt(0);
            answer += (char)(c + 49);
        }
        return answer;
    }
}