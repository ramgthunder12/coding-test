class Solution {
    public int solution(String my_string) {
        String[] numberAndCal = my_string.split(" ");
        int answer = Integer.parseInt(numberAndCal[0]);
        
        for(int i = 1; i < numberAndCal.length - 1; i = i + 2) {
            int num2 = Integer.parseInt(numberAndCal[i + 1]);
            if(numberAndCal[i].equals("+")) {
                answer = answer + num2;
            } else {
                answer = answer - num2;
            }
        }
        return answer;
    }
}