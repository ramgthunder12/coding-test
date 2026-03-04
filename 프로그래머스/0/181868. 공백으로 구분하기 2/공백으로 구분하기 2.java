class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.strip();
        System.out.println(my_string);
        String[] answer = my_string.split("\\s+");
        
        return answer;
    }
}