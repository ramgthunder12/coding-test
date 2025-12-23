class Solution {
    public int[][] solution(int[] num_list, int n) {
        int nLen = num_list.length;
        
        if(nLen == 0) {
            return null;
        }
        
        int m = nLen / n;
        int[][] answer = new int[m][n];
        int mCount = 0;
        //num_list.length / n 을 m 이라고 하자
        //m * n은 answer의 크기
        //0부터 num_list까지 돌면서 원소 하나씩 answer에 넣기
        //count라는 변수를 0으로 설정하기
        //i 와 n이 같을때 count 1씩 올리기
        //num_list.length % i 값이 배열 두번째 자리
        //count 값이 배열 첫번째 자리
        for(int i = 0; i < nLen; i++) {
            
            if(i == 0) {
                answer[mCount][0] = num_list[i];
            } else {
                if(i % n == 0) {
                    mCount++;
                }
                answer[mCount][i % n] = num_list[i];
            }
        }
        return answer;
    }
}