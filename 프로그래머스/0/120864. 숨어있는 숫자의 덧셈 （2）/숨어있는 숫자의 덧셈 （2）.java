class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //현 문자와 뒤에 있는 문자가 숫자인지 확인 
        //뒤의 문자가 문자일때 까지 반복해서 수 담기
        int current = 0;
        for(int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            
            if(Character.isDigit(currentChar)) {
                current = current * 10 + (currentChar - '0');               
            } else {
                answer = answer + current;
                current = 0;
            }
        }
        
        answer = answer + current;
        return answer;
    }
}