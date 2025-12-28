class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int arithmeticSequence = a;
        for(int i = 0; i < included.length; i++) {
            if(included[i]) {
                answer = answer + arithmeticSequence;
            }
            arithmeticSequence = arithmeticSequence + d;
        }
        return answer;
    }
}