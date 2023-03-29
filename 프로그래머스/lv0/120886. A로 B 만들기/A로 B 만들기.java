class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] bef = before.chars().map(c -> c -'0').sorted().toArray();
        int[] aft = after.chars().map(c -> c -'0').sorted().toArray();
        for (int i = 0; i < bef.length; i++) { 
            if (bef[i] != aft[i]) {
                answer = 0; 
            }
        }
        return answer;
    }
}