class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xNum = 0;
        int num = 0;
        //x의 값을 찾기, x가 있는 문자열앞의 숫자가 없으면 1, 있으면 숫자로 계산하기
        String[] polynomials = polynomial.split(" ");
        for(int i = 0; i < polynomials.length; i++) {
            if(polynomials[i].indexOf("x") >= 0) {
                if(polynomials[i].charAt(0) != 'x') {
                    xNum = xNum + Integer.parseInt(polynomials[i].replace("x", ""));    
                } else {
                    xNum = xNum + 1;
                }
                    
            } else if(polynomials[i].charAt(0) != '+') {
                num = num + Integer.parseInt(polynomials[i]);
            }
        }
        if(xNum == 1) {
            answer = "x";
        } else if (xNum == 0){
        } else {
            answer = xNum + "x";
        }
        
        if(num != 0) {
            if(xNum == 0) {
                answer = num + "";
            } else {
                answer = answer + " + " + num;    
            }
            
        }
        
        return answer;
    }
}