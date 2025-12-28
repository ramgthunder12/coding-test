import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //queries의 크기 만큼 반복해, s와 e, k값을 저장한다.
        //arr에서 s부터 e까지 반복하면서, arr의 값이 k의 배수인지 확인한다.
        //k의 배수가 맞다면 값을 올립니다.
        for(int i = 0; i < queries.length; i ++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int j = s; j <= e; j++) {
                if(j % k == 0) {
                    arr[j] = arr[j] + 1;
                }
            }
        }
        
        return arr;
    }
}