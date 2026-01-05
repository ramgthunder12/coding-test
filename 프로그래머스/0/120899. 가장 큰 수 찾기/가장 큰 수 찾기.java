class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int courrent;
        for(int i = 1; i < array.length; i++) {
            courrent = array[i];
            if(max < courrent) {
                max = courrent;
                answer[0] = courrent;
                answer[1] = i;
            }
        }
        return answer;
    }
}