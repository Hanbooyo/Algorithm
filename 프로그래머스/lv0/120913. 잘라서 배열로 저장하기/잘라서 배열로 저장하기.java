class Solution {
    public String[] solution(String my_str, int n) {
        if (n <= 0 || my_str == null || my_str.length() == 0) {
            return new String[0];
        }
        String[] answer = new String[(my_str.length() + n - 1) / n];
        int t = 0;
        for(int i = 0; i < answer.length; i++) {
            if (t + n <= my_str.length()) {
                answer[i] = my_str.substring(t, t + n);
            } else {
                answer[i] = my_str.substring(t);
            }
            t += n;
        }
        return answer;
    }
}
