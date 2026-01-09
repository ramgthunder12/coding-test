import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++) {
            String intStr = intStrs[i];
            intStr = intStr.substring(s, s + l);
            int num = Integer.parseInt(intStr);
            if(k < num) {
                answer.add(num);
            }
        }
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}