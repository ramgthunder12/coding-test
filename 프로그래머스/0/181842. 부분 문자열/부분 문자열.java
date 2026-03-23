import java.lang.StringBuilder;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        StringBuilder temp = new StringBuilder();
        
        for(int i = 0; i <= str2.length() - str1.length(); i++) {
            temp.append(str2.substring(i, i + str1.length()));
            
            if(str1.equals(temp.toString())) {
                answer = 1;
            }
            temp.setLength(0);
        }
        return answer;
    }
}