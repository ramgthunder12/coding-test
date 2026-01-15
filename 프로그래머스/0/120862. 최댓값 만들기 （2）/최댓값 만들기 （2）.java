import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int frontNum = numbers[0] * numbers[1];
        int endNum = numbers[numbers.length - 1] * numbers[numbers.length -2];
        if(frontNum >= endNum) {
            answer = frontNum;
        } else {
            answer = endNum;
        }
        return answer;
    }
}