class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] check = Integer.toString(order).split("");
        for(String a : check) {
            if(a.equals("3") || a.equals("6") || a.equals("9")) {
                answer ++;
            }
        }
        return answer;
    }
}