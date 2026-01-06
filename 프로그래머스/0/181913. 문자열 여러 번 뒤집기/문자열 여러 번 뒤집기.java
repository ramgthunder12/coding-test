class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder();
        //queries를 돌기
        StringBuilder reverseAnswer = new StringBuilder();
        answer.append(my_string);
        // s부터 e 까지 돌면서 뒤집기
        for(int i = 0; i < queries.length; i++) {
            reverseAnswer = new StringBuilder(answer.substring(queries[i][0], queries[i][1] + 1));
            reverseAnswer.reverse();
            answer.replace(queries[i][0], queries[i][1] + 1, reverseAnswer.toString());
        }
        return answer.toString();
    }
}