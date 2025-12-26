import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        //숫자 0 ~ 9 아스키코드 48 ~ 57
        //문자열에서 문자마다 숫자인지 확인하기
        //만약 숫자면 int로 변경하기
        //int값을 인덱스로 하는 배열에 값을 1 추가하기
        //배열을 돌면서 값이 1이상인 인덱스 찾기
        //answer에 인덱스 번호를 배열의 값만큼 넣기
        char zero = 48;
        char nine = 57;
        ArrayList<Integer> numberIndexArray = new ArrayList();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(zero <= my_string.charAt(i) && my_string.charAt(i) <= nine) {
                numberIndexArray.add(my_string.charAt(i) - 48);
            }
        }
        numberIndexArray.sort(null);
        int[] answer = new int[numberIndexArray.size()];
        for(int i = 0; i < numberIndexArray.size(); i++) {
            answer[i] = numberIndexArray.get(i);
        }
        return answer;
    }
}