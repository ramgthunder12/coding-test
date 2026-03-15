class Solution {
    public int solution(String num_str) {
        String[] numbers = num_str.split("");
        int answer = sum(numbers);
        return answer;
    }
    
    public int sum(String[] numbers) {
        int result = 0;
        for(int i = 0; i < numbers.length; i++) {
            result = result + Integer.parseInt(numbers[i]);
        }
        return result;
    }
}