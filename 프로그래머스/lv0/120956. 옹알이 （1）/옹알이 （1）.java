class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        for (String str : babbling) {
            if (canPronounce(str)) {
                count++;
            }
        }
        return count;
    }
    private boolean canPronounce(String str) {
        String[] words = {"aya", "ye", "woo", "ma"};
        for (String word : words) {
            if (str.startsWith(word)) {
                String remaining = str.substring(word.length());
                if (remaining.isEmpty()) {
                    return true;
                }
                if (canPronounce(remaining)) {
                    return true;
                }
            }
        }
        return false;
    }

}