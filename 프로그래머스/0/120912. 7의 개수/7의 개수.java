class Solution {
    public int solution(int[] array) {
        int answer = 0;
        //int[] 안에 문자인 7이 몇개 있는지, 자리 수 별로 계산하기
        //문자열로 바꾸기
        //반복해서 7찾기
        for(int i = 0; i < array.length; i++) {
            String str = array[i] + "";
            
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '7') {
                    answer = answer + 1;
                }
            }
        }
        return answer;
    }
}