class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tl = t.length();
        int pl = p.length();
        for(int i=0; i<=tl-pl; i++) {
            if(Long.parseLong(t.substring(i,i+pl)) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}