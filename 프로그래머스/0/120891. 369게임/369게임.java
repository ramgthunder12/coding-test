class Solution {
    public int solution(int order) {
        int answer = 0;
        //3, 6, 9를 카운트
        int[] number = new int[10];
        String orderString = String.valueOf(order);
        for(int i = 0; i < orderString.length(); i++) {
            number[(int)(orderString.charAt(i) - '0')] = number[(int)(orderString.charAt(i) - '0')] + 1;
        }
        answer = number[3] + number[6] + number[9];
        return answer;
    }
}