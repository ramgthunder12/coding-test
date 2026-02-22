import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        //arr temp 만들어서 계속 수정하기
        int[] answer = Arrays.copyOf(arr, arr.length);
        int[] arrTemp = {};
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                //뒷부분 자르기
                arrTemp = Arrays.copyOfRange(answer, 0, query[i] + 1);
            } else {
                //앞부분 자르기
                arrTemp = Arrays.copyOfRange(answer, query[i], answer.length);
            }
            answer = Arrays.copyOf(arrTemp, arrTemp.length);
        }
        return answer;
    }
}