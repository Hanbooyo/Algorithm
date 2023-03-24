class Solution {
    public int[] solution(long n) {
        String[] temp = Long.toString(n).split("");
        int[] answer = new int[temp.length]; 
        for(int i=answer.length-1; i>=0; i--) {
            answer[(answer.length-1)-i] = Integer.parseInt(temp[i]);
        }
        return answer;
    }
}