import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        //Arrays.copyOfRange(배열, 인덱스포함, 인덱스미포함);
        int[] answer = Arrays.copyOfRange(num_list, 0, n);
        return answer;
    }
}