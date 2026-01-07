class Solution {
    public int solution(String number) {
        int answer = 0;
        for(char c : number.toCharArray()) {
            answer = answer + (int) (c - '0');
        }
        answer = answer % 9;
        return answer;
    }
}