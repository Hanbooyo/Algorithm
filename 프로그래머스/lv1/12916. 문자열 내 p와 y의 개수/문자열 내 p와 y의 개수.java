class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.split("");
        int pcnt = 0;
        int ycnt = 0;
        for(int i=0; i<arr.length; i++) {
           if(arr[i].equals("P") || arr[i].equals("p")) {
               pcnt++;
           }else if(arr[i].equals("Y") || arr[i].equals("y")){
               ycnt++;
           }
        }
        if(pcnt == ycnt) {
            answer = true;
        }else {
            answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}