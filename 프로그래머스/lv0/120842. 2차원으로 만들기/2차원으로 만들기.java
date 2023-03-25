class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int a=0; int b=0;
        for(int i=0; i<num_list.length; i++) {
            answer[a][b] = num_list[i];
            b++;
            if(b == n) {
                a++;
                b=0;
            }
        }
        return answer;
    }
}