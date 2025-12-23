import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger mFactorial = factorial(share);
        BigInteger nMmFactorial = factorial(balls - share);
        BigInteger nFactorial = factorial(balls);
        int answer = nFactorial.divide(nMmFactorial.multiply(mFactorial)).intValue();
        // abc - ab, ac, bc
        // 12345 - 123, 124, 125, 134, 135, 145, 234, 235, 245, 345
        // 재귀 호출
        // count = 0일때 1 반환.
        //n * 자기 자신 호출
        
        return answer;
    }
    
    public BigInteger factorial(int i) {
        if(i == 1 || i == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(i).multiply(factorial(i - 1));
    }
}