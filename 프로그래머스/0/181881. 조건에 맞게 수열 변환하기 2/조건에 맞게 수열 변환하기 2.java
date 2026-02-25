import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int totalBefor = 0;
        int totalAfter = 0;
        
        while(true) {
            int[] prev = Arrays.copyOf(arr, arr.length);
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
                totalAfter = totalAfter + arr[i];
            }
            if(Arrays.equals(prev, arr)) {
                break;
            }
            answer++;
        }
        return answer;
    }
}