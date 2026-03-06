import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> x = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {  
                    x.add(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; j++) {  
                    x.remove(x.size() - 1);
                }
            }
        }
        answer = new int[x.size()];
        for(int i = 0; i < x.size(); i++) {
            answer[i] = x.get(i);
        }
        return answer;
    }
}