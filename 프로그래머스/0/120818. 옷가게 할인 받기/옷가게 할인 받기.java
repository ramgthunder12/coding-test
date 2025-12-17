class Solution {
    public int solution(int price) {
        int answer = 0;
        int salePrice = 0;
        if(price >= 500000) {
            salePrice = price * 80 / 100;
        } else if(price >= 300000) {
            salePrice = price * 90 / 100;
        } else if(price >= 100000) {
            salePrice = price * 95 / 100;
        } else {
            salePrice = price;
        }
        
        answer = salePrice;
        
        return answer;
    }
}