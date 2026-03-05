import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] answerEmpty = myStr.split("a|b|c");
        ArrayList<String> answerArray = new ArrayList<>();
        int count = 0;
        
        for(int i = 0; i < answerEmpty.length; i++) {
            if(!answerEmpty[i].isEmpty()) {
                count++;
                answerArray.add(answerEmpty[i]);
            }
        }
        
        String[] answer;
        
        if(count == 0) {
            answer = new String[]{"EMPTY"};
        } else {
            answer = answerArray.toArray(new String[count]);
        }
        return answer;
    }
}