class Solution {
    public String solution(int n) {
        if (n == 0) {
            return "";
        }
        int checker = (n - 1) % 3 + 1;
        return solution((n - checker) / 3) + String.valueOf(checker == 3 ? 4 : checker);
    }
}