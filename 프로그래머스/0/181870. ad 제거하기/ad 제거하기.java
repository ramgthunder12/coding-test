import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answerTemp = new ArrayList();

        for(String word : strArr) {
            if(!word.contains("ad")) {
                answerTemp.add(word);
            }
        }
        String[] answer = answerTemp.toArray(new String[answerTemp.size()]);
        return answer;
    }
}