class Solution {
    public int solution(String s) {
        // 공백으로 나누기
        //String이 Z와 같은지 확인하기
        //숫자를 더하기
        //만약, Z가 나오면 이전 숫자와 같은 값을 빼기
        //z 는 90
        int answer = 0;
        String[] numberAndZ = s.split(" ");
        int beforeNum = 0;
        
        for(int i = 0; i < numberAndZ.length; i++) {
            if(numberAndZ[i].charAt(0) == 90) {
                System.out.println(beforeNum);
                answer = answer - beforeNum;
            } else {
                answer = answer + Integer.parseInt(numberAndZ[i]);
                beforeNum = Integer.parseInt(numberAndZ[i]);
            }
            
        }
        return answer;
    }
}