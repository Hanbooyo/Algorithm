class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String tester = Integer.toString(num);
        if(tester.contains(Integer.toString(k))) {
            return tester.indexOf(Integer.toString(k))+1;   
        }else {
            return -1;
        }
    }
}