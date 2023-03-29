class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        String[] str = my_string.split(" ");
        for(int i=0; i<str.length; i++) {
             try {
                answer += Integer.parseInt(str[i]);
            } catch (NumberFormatException e) {
                // 예외 처리
            }
        }
        return answer;
    }
}