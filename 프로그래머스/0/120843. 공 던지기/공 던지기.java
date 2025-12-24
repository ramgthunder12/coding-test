class Solution {
    public int solution(int[] numbers, int k) {
        //첫번째 인덱스0
        //두번째 인덱스2
        //세번째 인덱스4
        int answer = 0;
        for(int i = 0; i < k; i++) {
            answer = numbers[(i * 2) % numbers.length];
        }
        return answer;
    }
}