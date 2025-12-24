import java.math.BigInteger;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = "" + a + b;
        String ab2 = 2 * a * b + "";
        
        BigInteger abInt = BigInteger.valueOf(Integer.valueOf(ab));
        BigInteger baInt = BigInteger.valueOf(Integer.parseInt(ab2));
        if(abInt.compareTo(baInt) >= 0) {
            answer = Integer.valueOf(ab);
        } else {
            answer = Integer.valueOf(ab2);
        }
        return answer;
    }
}