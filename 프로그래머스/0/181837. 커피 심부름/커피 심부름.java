class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String drink : order) {
            answer = answer + calculatePrice(drink);
        }
        
        return answer;
    }
    
    public int calculatePrice(String menu) {
        int price = 0;
        
        if(menu.contains("latte")) {
            price = 5000;
        } else {
            price = 4500;
        }
        
        return price;
    }
}