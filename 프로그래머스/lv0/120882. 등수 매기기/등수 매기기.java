class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] temp = new int[score.length];
        for(int i=0; i<score.length; i++) {
            temp[i] = score[i][0] + score[i][1];
        } 
        for(int i=0; i<temp.length; i++) {
            answer[i] += 1;
            for(int j=0; j<temp.length; j++) {
                if(i != j) {
                    if(temp[i] < temp[j]) {
                        answer[i] += 1;
                    }
                }
            }
        }
        return answer;
    }
}