import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Pair[] pairs = new Pair[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            int distance = Math.abs(numlist[i] - n);
            pairs[i] = new Pair(numlist[i], distance);
        }
        Arrays.sort(pairs);
        int[] answer = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            answer[i] = pairs[i].value;
        }
        return answer;
    }
    
    static class Pair implements Comparable<Pair> {
        int value;
        int distance;
        
        public Pair(int value, int distance) {
            this.value = value;
            this.distance = distance;
        }
        
        @Override
        public int compareTo(Pair o) {
            if (this.distance != o.distance) {
                return Integer.compare(this.distance, o.distance);
            } else {
                return Integer.compare(o.value, this.value);
            }
        }
    }
}
