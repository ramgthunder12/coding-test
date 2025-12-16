class Solution {
    //최대로 마실 수 있는 아메리카노의 잔의 수, 남는돈
    //아메리카노 5500
    public int[] solution(int money) {
        int[] answer = new int[2];
        int iceAmericano = 5500;
        
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        
        return answer;
    }
}