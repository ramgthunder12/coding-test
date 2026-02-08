class Solution {
    public String solution(String my_string, int s, int e) {
        if(s == e) {
            return my_string;
        }
        String answer = my_string.substring(0, s);
        String reversStr = my_string.substring(s, e + 1);
        System.out.println(answer);
        for(int i = reversStr.length() - 1; i >= 0; i--) {
            answer = answer + reversStr.charAt(i);
        }
        if(my_string.length() > e) {
            answer = answer + my_string.substring(e + 1, my_string.length());
        }
        return answer;
    }
}