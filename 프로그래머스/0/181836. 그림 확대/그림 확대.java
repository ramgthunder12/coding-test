import java.lang.StringBuilder;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int count = 0;
        
        for(int j = 0; j < picture.length; j++) {
            for(int i = 0; i < k; i++) {
                answer[count++] = repeat(picture[j], k);
            }
        }
        return answer;
    }
    
   public String repeat(String str, int k) {
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < str.length(); i++) {
           for(int j = 0; j < k; j++) {
               sb.append(str.charAt(i));
           }
       }
       return sb.toString();
   }
}