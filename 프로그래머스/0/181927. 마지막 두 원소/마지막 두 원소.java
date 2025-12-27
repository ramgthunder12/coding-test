class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        int lastValue = num_list[len - 1];
        int last2Value = num_list[len - 2];
        if(lastValue > last2Value) {
            answer[len] = lastValue - last2Value;
        } else {
            answer[len] = lastValue * 2;
        }
        return answer;
    }
}