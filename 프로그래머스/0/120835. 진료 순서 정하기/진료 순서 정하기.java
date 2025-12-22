class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];
        
        for(int i = 0; i < n; i++) {
            int rank = 1;
            
            for(int j = 0; j < n; j++) {
                if(emergency[j] > emergency[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}