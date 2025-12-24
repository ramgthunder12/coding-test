import java.util.Arrays;

class Solution {
    //정렬
    //마지막 인덱스 * 마지막 -1 인덱스
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        
        int answer = numbers[len -1] * numbers[len - 2];
        return answer;
    }
}