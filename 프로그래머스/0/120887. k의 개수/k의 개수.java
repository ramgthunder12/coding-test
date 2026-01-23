class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int start = i; start <= j; start++) {
            String num = start + "";
            for(char n : num.toCharArray()) {
                if((int)(n - '0') == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}