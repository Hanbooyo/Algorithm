import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger n = BigInteger.valueOf(balls);
        BigInteger r = BigInteger.valueOf(share);
        BigInteger nCr = BigInteger.ONE;
        for(int i = 0; i < share; i++) {
            nCr = nCr.multiply(n.subtract(BigInteger.valueOf(i))).divide(BigInteger.valueOf(i+1));
        }
        return nCr;
    }
}
