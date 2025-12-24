import java.lang.StringBuilder;

class Solution {
    public String solution(String str1, String str2) {
        //answer의 길이는 str1길이 * 2
        //반복문 돌면서 0일때
        // 0123456789
        // 0011223344 나눴을때 몫
        int sLen = str1.length();
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < sLen; i++) {
            if(i == 0) {
                answer.append(str1.charAt(0));
                answer.append(str2.charAt(0));
            } else {
                answer.append(str1.charAt(i));
                answer.append(str2.charAt(i));
            }
        }
        return answer.toString();
    }
}