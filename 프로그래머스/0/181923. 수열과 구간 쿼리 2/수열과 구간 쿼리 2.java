import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //k 보다 크면서 가장 작은 값? 정렬
        //arr를 복사해 정렬하기
        //복사하고 정렬한 값중에서 k보다 큰값이 나왔을때 그 다음 인덱스의 값 가지고 오기
        //그 다음 인덱스가 있는지 없는지 어떻게 알지?
        int[] answer = new int[queries.length];
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i = 0; i < queries.length; i++) {
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2]) {
                    arrList.add(arr[j]);
                }
            }
            if(arrList.isEmpty()) {
                answer[i] = -1;
            } else {
                Collections.sort(arrList);
                answer[i] = arrList.get(0);
                arrList.clear();
            }
            
        }
        
        return answer;
    }
}