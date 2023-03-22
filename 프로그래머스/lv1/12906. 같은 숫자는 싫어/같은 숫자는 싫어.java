import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> dap = new ArrayList();
        dap.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
        	if(arr[i] != arr[i-1]) {
        		dap.add(arr[i]);
        	}
        }
        
        int[] answer = dap.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}