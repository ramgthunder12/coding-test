class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            count = count + arr[i];
        }
        answer = new int[count];
        count--;
        
        for(int i = arr.length - 1; i >= 0; i--) {
            for(int j = arr[i]; j > 0; j--) {
                answer[count--] = arr[i];
            }
        }
        return answer;
    }
}