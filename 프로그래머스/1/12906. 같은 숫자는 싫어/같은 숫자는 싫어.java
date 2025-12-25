import java.util.*;

public class Solution {
    //1부터 길이 - 1 까지 확인한다.
    //앞의 값과 현재의 값이 다르면
    //앞의 값을 넣는다.
    public int[] solution(int []arr) {
        ArrayList temp = new ArrayList();
        temp.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] != arr[i]) {
                temp.add(arr[i]);
            }
        }
        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++) {
            answer[i] = (int) temp.get(i);
        }
        return answer;
    }
}