class Solution {
    public int solution(String my_string) {
        //숫자 꺼내기
        //숫자 누적해서 더하기
        System.out.println();
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(48 <= my_string.charAt(i) && my_string.charAt(i) <= 57) {
                answer = answer + (my_string.charAt(i) - 48);
            }
        }
        return answer;
    }
}