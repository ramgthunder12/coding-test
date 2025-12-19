class Solution {
    public String solution(String my_string, String letter) {
        
        //String answer = my_string.replace(letter, "");
        String answer = "";
        //replace 없이
        StringBuffer buffer = new StringBuffer();
        char letterChar = letter.charAt(0);
        
        for(int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if(currentChar != letterChar) {
                buffer.append(currentChar);
            }
        }
        
        answer = buffer.toString();
        
        return answer;
    }
}