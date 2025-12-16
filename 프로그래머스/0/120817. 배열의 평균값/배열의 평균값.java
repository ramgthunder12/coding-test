class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        
        for(int i : numbers) {
            sum = sum + i;
        }
        
        answer = (double) sum / numbers.length;
        
        return answer;
    }
}