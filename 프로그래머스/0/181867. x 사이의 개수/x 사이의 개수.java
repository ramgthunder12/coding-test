import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> answerList = new ArrayList<>();
        int count = 0;
        
        for(char c : myString.toCharArray()) {
            if(c == 'x') {
                answerList.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        answerList.add(count);
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}