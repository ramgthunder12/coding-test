import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        char[] answer = new char[my_string.length()];
        
        for(int i = 1; i <= my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i - 1))) {
                answer[i - 1] = Character.toLowerCase(my_string.charAt(i - 1));
            } else {
                answer[i - 1] = my_string.charAt(i - 1);
            }
            
            System.out.println(Arrays.toString(answer));
        }
        Arrays.sort(answer);
        StringBuilder result = new StringBuilder();
        for(char c : answer) {
               result.append(c);
        }
        return result.toString();
    }
}