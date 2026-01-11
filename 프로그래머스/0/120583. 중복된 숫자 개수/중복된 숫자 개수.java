import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        boolean end = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                answer = answer + 1;
            }
        }
        return answer;
    }
}