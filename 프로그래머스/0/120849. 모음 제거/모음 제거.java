class Solution {
    public String solution(String my_string) {
        //replace a, e, i, o, u -> ""
        //모음 배열 만들기
        //모음 배열의 요소와 my_string이 같은지 확인하기
        //같으면 제거 하기
        String answer = my_string;
        String[] gather = {"a", "e", "i", "o", "u"};
        for(int i = 0; i < gather.length; i++) {
            answer = answer.replaceAll(gather[i], "");
        }
        return answer;
    }
}