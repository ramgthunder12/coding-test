class Solution {
    public String solution(String my_string, int n) {
        StringBuffer answer = new StringBuffer();
        
        for(int j = 0; j < my_string.length(); j++) {
            for(int i = 0; i < n; i++) {
                answer.append(my_string.charAt(j));
            }
        }
        
        return answer.toString();
    }
}