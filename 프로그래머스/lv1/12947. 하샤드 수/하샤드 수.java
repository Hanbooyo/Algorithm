class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = Integer.toString(x);
        for(int i=0; i<str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        if(x%sum == 0) {
                answer = true;
        }else {
                answer = false;
        }
        return answer;
    }
}

