class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] strCountArr = new int[30];
        
        for(int i = 0; i < strArr.length; i++) {
            strCountArr[strArr[i].length() - 1]++;
        }
        for(int i : strCountArr) {
            if(answer < i) {
                answer = i;
            }
        }
        
        return answer;
    }
}