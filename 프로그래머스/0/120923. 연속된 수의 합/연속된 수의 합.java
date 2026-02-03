class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        //12가 되는 3개의 값 : 3 * x = 12, x값을 평균으로 갖는 연속된 수의 배열? 12 / 3 = 4
        //5가 되는 5개의 값 : 5 * x = 5, x 값을 평균으로 갖는 연속된수 의 배열
        //14가 되는 4개의 값 : 4 * x = 14, x는 3~4 값을 평균으로 갖는 연속된 14 / 4 = 3.5
        //배열의 가운데 인덱스(홀수 일때 : length / 2, 짝수 일때 :length / 2 - 1)에 평균값 x넣기
        //반복문을 인덱스 길이의 반만 돌면서 가운데 인덱스 부터  -1 or +1 (x가 짝수 일때 length -1에 값하나더 넣어주기)
        
        int average = total / num;
        int len = num / 2;
        boolean isOdd = true;
        
        if(num % 2 == 0) {
            isOdd = false;
            len = len - 1;
        }
        
        if(isOdd) {
            answer[len] = average;
            
            for(int i = 1; i <= len; i++) {
                answer[len + i] = average + i;
                answer[len - i] = average - i;
            }
        } else {
            for(int i = 0; i <= len; i++) {
                answer[len + i] = average + i;
                answer[len - i] = average - i;
                if(i == len) {
                    answer[len + 1 + i] = average + 1 + i;
                }
            }
        }
        return answer;
    }
}