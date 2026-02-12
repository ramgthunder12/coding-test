import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> answerTemp = new ArrayList<>();
        if(n == 1) {
            slicer[0] = 0;
            slicer[2] = 1;
        } else if(n == 2) {
            slicer[1] = num_list.length - 1;
            slicer[2] = 1;
        } else if(n == 3) {
            slicer[2] = 1;
        }
        //1 0b1
        //2 a-1
        //3 ab1
        //4 abc
        for(int i = slicer[0]; i <= slicer[1]; i = i + slicer[2]) {
            answerTemp.add(num_list[i]);
        }
        
        int[] answer = new int[answerTemp.size()];
        for(int i = 0; i < answerTemp.size(); i++) {
            answer[i] = answerTemp.get(i);
        }
        return answer;
    }
}