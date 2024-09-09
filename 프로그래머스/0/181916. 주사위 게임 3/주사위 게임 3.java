public class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] counts = new int[7];
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;

        // 모든 주사위가 같은 경우
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 4) {
                return 1111 * i;
            }
        }

        // 3개가 같고 1개가 다른 경우
        for (int p = 1; p <= 6; p++) {
            if (counts[p] == 3) {
                for (int q = 1; q <= 6; q++) {
                    if (counts[q] == 1) {
                        return (10 * p + q) * (10 * p + q);
                    }
                }
            }
        }

        // 2개씩 같은 경우
        for (int p = 1; p <= 6; p++) {
            if (counts[p] == 2) {
                for (int q = p + 1; q <= 6; q++) {
                    if (counts[q] == 2) {
                        return (p + q) * Math.abs(p - q);
                    }
                }
            }
        }

        // 2개가 같고 나머지가 다른 경우
        for (int p = 1; p <= 6; p++) {
            if (counts[p] == 2) {
                int q = 0, r = 0;
                for (int i = 1; i <= 6; i++) {
                    if (i != p && counts[i] == 1) {
                        if (q == 0) q = i;
                        else r = i;
                    }
                }
                if (q != 0 && r != 0) {
                    return q * r;
                }
            }
        }

        // 모두 다른 경우
        int min = Math.min(Math.min(a, b), Math.min(c, d));
        return min;
    }
}