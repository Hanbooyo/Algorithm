class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int temp=0;
        int tempX=0;
        String[] str = polynomial.split(" ");
        for(String a : str) {
            if(a.equals("+")) {
                
            }else if(a.contains("x")){
                if(a.equals("x")) {
                    tempX++;
                }else {
                    tempX += Integer.parseInt(a.replace("x",""));
                }
            }else {
                temp += Integer.parseInt(a);
            }
        }
        if(tempX != 0) {
            answer += (Integer.toString(tempX))+"x";
        }
        if (temp != 0) {
            if(temp > 0 && tempX != 0) {
                answer += " + ";
            }
            answer += Integer.toString(temp);
        }
        if(tempX == 1) {
            if(temp == 0) {
                return "x";
            }else {
                return "x + "+temp;
            }
            
        }
        
        return answer;
    }
}
