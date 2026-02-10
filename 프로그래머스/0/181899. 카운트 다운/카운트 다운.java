class Solution {
    public int[] solution(int start_num, int end_num) {
        int len = start_num - end_num + 1;
        int[] answer = new int[len];
        int current_num = start_num;
        
        for(int i = 0; i < len; i++) {
            answer[i] = current_num--;
        }
        return answer;
    }
}