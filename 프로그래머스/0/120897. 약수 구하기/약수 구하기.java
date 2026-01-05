import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        //나눌수 있는 수
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                //약수
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}