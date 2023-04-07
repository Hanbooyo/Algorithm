class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x=0; int y=0;
        for(String a : keyinput) {
            if(a.equals("left")) {
                if(x==(0-(board[0])/2)) {
                    
                }else {
                    x--;
                }
            }else if(a.equals("right")){
                if(x==(0+(board[0])/2)) {
                    
                }else {
                    x++;
                }
            }else if(a.equals("up")){
                if(y==(0+(board[1])/2)) {
                    
                }else {
                    y++;
                }
            }else if(a.equals("down")){
                if(y==(0-(board[1])/2)) {
                    
                }else {
                    y--;
                }
            }else {
                
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}