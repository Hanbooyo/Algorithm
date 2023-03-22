class Solution {
    public int solution(int[][] dots) {
        // x, y의 최대값과 최소값을 계산합니다.
        int maxX = dots[0][0], minX = dots[0][0];
        int maxY = dots[0][1], minY = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            maxX = Math.max(maxX, dots[i][0]);
            minX = Math.min(minX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
            minY = Math.min(minY, dots[i][1]);
        }

        // 직사각형의 넓이를 계산합니다.
        int width = maxX - minX;
        int height = maxY - minY;
        int area = width * height;

        return area;
    }
}