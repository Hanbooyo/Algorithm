class Solution {
    public int solution(int[] sides) {
        int maxSide = Math.max(sides[0], sides[1]);
        int minSide = Math.min(sides[0], sides[1]);
        int thirdSide = maxSide - minSide + 1;
        int count = 0;
        for (int i = thirdSide; i < maxSide + minSide; i++) {
            if (i > maxSide - minSide) {
                count++;
            }
        }
        return count;
    }
}
