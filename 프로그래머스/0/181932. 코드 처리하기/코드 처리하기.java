import java.lang.StringBuffer;

class Solution {
    public String solution(String code) {
        //1이면 mode를 1또는 0으로 바꾼다
        //mode가 0이면 인덱스가 짝수 일때만 ret 에 code[짝수]를 담는다.
        //mode가 1이면 인덱스가 홀 수 일때만 ret에 code[홀수]를 담는다.
        //ret가 빈문자열이면 EMPTY 반환하기
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        for(int i = 0; i < code.length(); i++) {
            char element = code.charAt(i);
            
            if(element == '1') {
                if(mode == 1) {
                    mode = 0;
                } else {
                    mode = 1;
                }
                continue;
            }
            
            if(mode == 0) {
                //mode 0일때
                if(i % 2 == 0) {
                    ret.append(element);
                }
            } else {
                //mode 1일때
                if(i % 2 == 1) {
                    ret.append(element);
                }
            }
        }

        if(ret.toString().equals("")) {
            return "EMPTY";
        }
        
        return ret.toString();
    }
}