class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        //1 1 : 0
        
        //2 1 : 1
        //2 2 : 3
        //2 3 : 5
        //2 4 : 7
        //2 5 : 9
        
        //3 1 : 2
        //3 2 : 5
        //3 3 : 8
        //3 4 : 11
        
        //4 1 : 3
        //4 2 : 7
        
        if(M == 1 && N == 1) {
            answer = 0;
        } else {
            answer = M * N - 1;
        }
        return answer;
    }
}