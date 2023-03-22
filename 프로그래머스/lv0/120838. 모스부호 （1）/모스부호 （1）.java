class Solution {
    public String solution(String letter) {
	    String[] letters = letter.split(" ");
	    String answer = "";
	    String[] morseCodeArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

	    String[] alphabetArray = {
	      "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
	      "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
	    };
	    
        for(int j=0; j<letters.length; j++) {
            for(int i=0; i<morseCodeArray.length; i++) {
                if(letters[j].equals(morseCodeArray[i])) {
	    			answer += alphabetArray[i];
	    		}
            }
        }
        
        return answer;
    }
}