class Solution {
    public String solution(String my_string) {
        //버퍼에 하나씩 담기
        //하나씩 replace해서 다시 my_string에 담기
        String answer = "";
        String copyString = my_string;
        for(int i = 0; i < my_string.length(); i++) {
            String s = my_string.charAt(i) + "";
            if(!answer.contains(s)) {
                answer = answer + s;    
            }
        }
        return answer;
    }
}