class Solution {
    public String solution(String my_string) {
        String answer = "";
        //'a' == 97 보다 작으면 대문자
        char[] my_charArray = new char[my_string.length()];
        int aAGap = 'a' - 'A';
        for(int i = 0; i < my_string.length(); i++) {
            char my_char = my_string.charAt(i);
            if(my_char < 'a') {
                my_charArray[i] = (char)(my_char + aAGap);
            } else {
                my_charArray[i] = (char)(my_char - aAGap);
            }
        }
        answer = new String(my_charArray);
        return answer;
    }
}