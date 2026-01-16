class Solution {
    public int solution(int[] sides) {
        //가장 긴변의 길이 = 다른 두변의 길이의 합보다 작아야 한다.
        //1. sides중 큰수가 가장 긴변일때
            //1. sides[0] > sides[1]일때, 가장 긴변 변수에 담기
            //2. 남은 한변 변수, 부터, 가장 긴변수까지 반복하기,
            //3. 남은 한변 변수 + 증가하는 수
            //6 < 3 + x
            //6 -3 < x == 4, 5, 6, 7, 8
            //큰수 - 작은수 보다 큰수를 배열에 담기(문제는 끝이 없음)
        //2. sides를 합친 길이 일때
            //6 + 3 = 9 > x
            //x = 8, 7, 6, 5, 4, 3, 2, 1
            //큰수 + 작은수 보다 작은수부터 배열에 담기 1까지
        //(큰수 - 작은수) < x < (큰수 + 작은수) 인 조건만, 1부터 큰수 + 작은 수까지 반복해서 카운트 하기
        int answer = 0;
        int bigNum = 0;
        int smallNum = 0;
        if(sides[0] > sides[1]) {
            bigNum = sides[0];
            smallNum = sides[1];
        } else {
            bigNum = sides[1];
            smallNum = sides[0];
        }
        for(int i = 1; i < (bigNum + smallNum); i++) {
            if((bigNum - smallNum) < i && i < (bigNum + smallNum)) {
                answer++;
            }
        }
        return answer;
    }
}