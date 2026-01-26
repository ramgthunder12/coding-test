class Solution {
    public int solution(String[] babbling) {
        //babbling에서 aya, ye, woo, ma 한번씩 찾기
        String[] babblsText = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String babbl : babbling) {
            int len = babbl.length();
            String temp = babbl;
            for(String babblText : babblsText) {
                temp = temp.replace(babblText, " ");
            }
            
            if(temp.replace(" ", ""). equals("")) {
                answer++;
            }
            
        }

        return answer;
    }
}