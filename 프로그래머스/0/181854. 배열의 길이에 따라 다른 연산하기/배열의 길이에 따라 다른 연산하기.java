import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        int evenOdd = 0;
        if(arr.length % 2 == 0) {
            //홀수 인덱스 값 바꾸기
            evenOdd = 1;
        }
        for(int i = evenOdd; i < arr.length; i = i + 2) {
            answer[i] = arr[i] + n;
        }
        return answer;
    }
}