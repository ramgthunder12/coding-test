class Solution {
    //만약 ">", "=" : n >= m
    //조건과 일치하면 1을 반환한다.
    //만약 "<", "=" : n <= m
    //만약 ">", "!" : n > m
    //만약 "<", "!" : n < m
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals(">")) {
            if(eq.equals("=")) {
                if(n >= m) {
                    answer = 1;
                }
            } else if(eq.equals("!")) {
                if(n > m) {
                    answer = 1;
                }
            }
        } else if(ineq.equals("<")){
            if(eq.equals("=")) {
                if(n <= m) {
                    answer = 1;
                }
            } else if(eq.equals("!")) {
                if(n < m) {
                    answer = 1;
                }
            }
        }
        return answer;
    }
}