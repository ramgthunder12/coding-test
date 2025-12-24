class Solution {
    //합성수 : 약수의 개수가 3개 이상인 수
    //소수 : 약수가 1, 자기자신 밖에 없는 수
    // 소수의 개수를 빼면 되지 않을까?
    //1부터 n까지에서 소수의 개수 구하기
    
    //소수 구하기
    //i는 2부터 n-1까지 확인한다
    //소수인지 아닌지 구별하는 변수를 저장한다.
    //들어오는 숫자를 i로 나눴을때 나머지가 0일때
    //소수 구별 변수에 값을 false로 변경한다.
    
    //4부터 n까지 확인한다.
    //소수 구별 변수가 false일때
    //개수를 세는 변수의 값을 1나올린다.
    
    //composite number
    public int solution(int n) {
        int answer = 0;
        boolean isDecimal = true;
        int compositeCount = 0;
        
        for(int i = 4; i <= n; i++) {
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    System.out.printf("is not decimal : %d, %d\n", i, j);
                    isDecimal = false;
                    break;
                }
            }
            if(!isDecimal) {
                compositeCount++;
                isDecimal = true;
            }
        }
        answer = compositeCount;
        return answer;
    }
}