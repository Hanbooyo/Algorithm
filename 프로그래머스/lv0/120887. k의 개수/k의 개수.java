class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j; a++) {
            String[] str = Integer.toString(a).split("");
            for(int b=0; b<str.length; b++) {
                if(str[b].equals(Integer.toString(k))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}