import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        //소수인지 확인하기
        //만약 소수라면
        //자기 자신을 answer에 담에 반환하기
        //만약 아니라면
        //반복문 돌면서 2 ~ 자기 자신까지 나눠서 0이 되는 값 찾기
        //나눠서 0이 된다면 나눈값을 다시 n에 담기
        //answer에 추가하기
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                result.add(i);
                while(n % i == 0) {
                    n = n / i;
                }              
            }

        }
        
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}