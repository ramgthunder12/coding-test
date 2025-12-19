class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int serviceDrinkCount = n / 10;
        int drinkPrice = (k - serviceDrinkCount) * 2000;
        int lambPrice = n * 12000;
        
        answer = lambPrice + drinkPrice;
        
        return answer;
    }
}