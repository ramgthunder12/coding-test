class Solution {
    //number를 n으로 나눴을때 나머지가 0이 되면서, number를 m으로 나눴을때 나머지가 0이면 1를 반환
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n == 0 && number % m == 0) {
            answer = 1;
        }
        return answer;
    }
}