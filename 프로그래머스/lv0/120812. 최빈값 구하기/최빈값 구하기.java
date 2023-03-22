class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] index = new int[1001];

        for(int i = 0; i<array.length; i++) {
			index[array[i]]++; 
		}
        
        int max = 0;
        int max_index = 0;
        
        for(int i = 0; i<index.length; i++) {
			if(index[i] > max) { 
				    max = index[i];
            max_index = i;
			}
		}
        
        int count = 0;
        for(int i = 0; i<index.length; i++) {
            if(index[i] == max) {
                count++;
            }
        }
        answer = max_index;
        
        if(count > 1) {
            answer = -1;
        }
        return answer;
    }
}