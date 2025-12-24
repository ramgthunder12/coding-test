import java.math.BigInteger;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        //[x]붙이고 비교하기
        //잘라서 비교하고 붙이기
        //문자열로 만들어서  a + b, b + a 만들기
        //다시 숫자로 만들기 10자리 BingInteger
        //(a + b) - (b + a) > 0 면 ab가 더 큰값
        String ab = "" + a + b;
        String ba = "" + b + a;
        
        BigInteger abInt = BigInteger.valueOf(Integer.valueOf(ab));
        BigInteger baInt = BigInteger.valueOf(Integer.parseInt(ba));
        if(abInt.compareTo(baInt) >= 0) {
            answer = Integer.valueOf(ab);
        } else {
            answer = Integer.valueOf(ba);
        }
        return answer;
    }
}