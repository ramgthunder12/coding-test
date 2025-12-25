class Solution {
    //factorial 값구하기
    //3부터 10까지 확인하기
    //만약 n이 i팩토리얼 보다 작을때 확인
    //i - 1값을 변수에 넣기
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 10; i++) {
            if(n == 3628800) {
                answer = 10;
                break;
            }
            if(n >= factorial(i)) {
                answer = i;
            }
        }
        return answer;
    }
    
    public int factorial(int i) {
        if(i == 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}