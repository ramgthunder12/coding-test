class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int targetLen = target.length();
        
        for(int i = 0; i <= my_string.length() - targetLen; i++) {
            String my_substring = my_string.substring(i, i + targetLen);

            if(target.equals(my_substring)) {
                i = i + targetLen - 1;
                answer = 1;
            }
        }
        return answer;
    }
}