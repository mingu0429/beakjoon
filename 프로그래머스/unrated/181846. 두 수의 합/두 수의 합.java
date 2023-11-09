import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        
        BigInteger bigIntA = new BigInteger(a);
        BigInteger bigIntB = new BigInteger(b);
        
        return bigIntA.add(bigIntB).toString();
    }
}