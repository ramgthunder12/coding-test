class Solution {
    //n을 2로 나눈 나머지가 1이라면 isOdd의 변수의 값을 true로 바꾼다.
    //1부터 n까지 확인한다.
    //만약 i를 2로 나눈 나머지가 1이라면
    //i값을 총값과 더한다.
    
    //만약 아니라면
    //i값의 제곰을 총값과 더한다.
    public int solution(int n) {
        int answer = 0;
        boolean isOdd = false;
        
        if(n % 2 == 1) {
            isOdd = true;
        }
        
        for(int i = 1; i <= n; i++) {
            if(isOdd) {
                if(i % 2 == 1) {
                    answer = answer + i;
                }
            } else {
                if(i % 2 == 0) {
                    answer = answer + (i * i);
                }
            }
        }
        return answer;
    }
}