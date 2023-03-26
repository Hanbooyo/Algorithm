import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String nString = Long.toString(n);
        char[] arr = nString.toCharArray();
        Arrays.sort(arr);
        String temp =  new StringBuilder(new String(arr)).reverse().toString();
        answer = Long.parseLong(temp);
        return answer;
    }
}