import java.math.*;

class Solution {
    public String solution(String a, String b) {
        
        BigInteger an = new BigInteger(a);
        BigInteger bn = new BigInteger(b);
            
        BigInteger sum = an.add(bn);
        
        return sum.toString();
    }
}