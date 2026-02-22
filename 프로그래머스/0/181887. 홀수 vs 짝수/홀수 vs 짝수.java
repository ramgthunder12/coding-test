class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int oddSum = 0;
        int evenSum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                evenSum = evenSum + num_list[i];
            } else {
                oddSum = oddSum + num_list[i];
            }
        }
        
        if(oddSum > evenSum) {
            answer = oddSum;
        } else {
            answer = evenSum;
        }
        return answer;
    }
}