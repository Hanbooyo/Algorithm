class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        double count = 0;
        for(int i=0; i<numbers.length; i++) {
            sum+=numbers[i];
            count++;
        } 
        answer = sum/count;
        return answer;
    }
}