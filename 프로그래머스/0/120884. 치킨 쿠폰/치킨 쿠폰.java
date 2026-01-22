class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int qupon = 0;
        while(chicken > 9) {
            qupon = (chicken / 10) + qupon;
            chicken = (chicken / 10) + (chicken % 10);
        }
        answer = qupon;
        return answer;
    }
}