class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        //replace(문자열을, 문자열로)
        //He11oWor1d
        //  lloWorl
        //012
        //2번 인덱스부터, 9(2+ lloWorl의 길이)번째까지개 까지
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length(), my_string.length());
        return answer;
    }
}