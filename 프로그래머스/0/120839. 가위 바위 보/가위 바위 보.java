class Solution {
    public String solution(String rsp) {
        //rock = 0, paper = 5, scissors = 2
        //rsp의 한글자씩 비교한다.
        //만약 0이라면 5를 반환하고, 2이면 0을 반환하고, 5이면 2를 반환한다.
        String answer = "";
        
        for(char r : rsp.toCharArray()) {
            switch(r) {
                case '0':
                    answer = answer + "5";
                    break;
                case '5':
                    answer = answer + "2";
                    break;
                case '2':
                    answer = answer + "0";
                    break;
            }
        }
        
        return answer;
    }
}