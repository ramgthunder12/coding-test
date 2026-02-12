class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        //1을 찾았을때 amswer에 값 넣기
        for(int i = idx; i < arr.length; i++) {
            if(1 == arr[i]) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}