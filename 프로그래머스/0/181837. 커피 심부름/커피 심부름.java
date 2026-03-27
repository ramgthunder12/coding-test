class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String drink : order) {
            answer = answer + isPrice(drink);
        }
        
        return answer;
    }
    
    public int isPrice(String menu) {
        int price = 0;
        
        if(menu.contains("am")) {
            price = 4500;
        } else if(menu.contains("att")) {
            price = 5000;
        } else if(menu.contains("any")) {
            price = 4500;
        }
        
        return price;
    }
}