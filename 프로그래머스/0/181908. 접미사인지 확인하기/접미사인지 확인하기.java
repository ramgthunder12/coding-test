class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len = my_string.length();
        String suffix;
        for(int i = 0; i < len; i++) {
            suffix = my_string.substring(i, len);
            if(suffix.equals(is_suffix)) {
                answer++;
            }
        }
        return answer;
    }
}