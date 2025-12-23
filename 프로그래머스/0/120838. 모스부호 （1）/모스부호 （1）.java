import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String solution(String letter) {
        //0. 인덱스 0에 a의 모스부호, 인덱스 1에 b의 모스부호 .. 25번 인덱스까지 넣기
        //1. 모스부호는 공백으로 나눠저 있으므로 letter를 공백문자로 split하기
        //2. 공백문자로 나눈 문자열 String[]에 담기
        //3. 반복문을 돌면서 몇번째 인덱스의 값과 letter의 값이 같은지 찾기
        //4. 만약 같으면, 해당 인덱스 + 97 한 값을 char에 담기
        //5. char 타입의 값을 문자열에 추가 하기
        String[] morse = { 
    ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        char c;
        String answer = "";
        String[] morseLetters = letter.split(" ");
        
        for(int i = 0; i < morseLetters.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(morseLetters[i].equals(morse[j])) {
                    c = (char)(j + 97);
                    answer = answer + c;
                    break;
                }
            }      
        }
        
        return answer;
    }
}