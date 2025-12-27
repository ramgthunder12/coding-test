class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int n = numLog[0];
        int current = 0;
        for(int i = 1; i < numLog.length; i++) {
            current = numLog[i];
            if(n + 1 == current) {
                answer = answer + "w";
                n = n + 1;
            } else if (n - 1 == current) {
                answer = answer + "s";
                n = n - 1;
            } else if (n + 10 == current) {
                answer = answer + "d";
                n = n + 10;
            } else if (n - 10 == current) {
                answer = answer + "a";
                n = n - 10;
            }
        }
        return answer;
    }
}