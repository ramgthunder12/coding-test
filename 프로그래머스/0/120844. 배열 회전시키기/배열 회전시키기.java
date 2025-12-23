class Solution {
    public int[] solution(int[] numbers, String direction) {
        int nLen = numbers.length;
        int[] answer = new int[nLen];
        
        //numbers 길이만큼 answer크기 정하기
        //direction이 right이면
        //numbers의 길이 -1 의 인덱스를 가진 원소를 temp에 저장하기
        //반복문을 돌면서 인덱스 0번을 1번에, 1번을 2번에, ..., 길이 -1번을 0번 answer에 저장하기
        
        //direction이 left면
        //반복문을 돌면서 numbers인덱스 0번을 answer 길이 - 1번에, 1번을 0번에, ..., 길이 -1번을 길이-2번 answer에 저장하기
        
        if(direction.equals("right")) {
            for(int i = 0; i < nLen; i++) {
                if(i == nLen - 1) {
                    answer[0] = numbers[i];
                } else {
                    answer[i + 1] = numbers[i];
                }
            }    
        } else if(direction.equals("left")) {
            for(int i = 0; i < nLen; i++) {
                if(i == 0) {
                    answer[nLen - 1] = numbers[i];
                } else {
                    answer[i - 1] = numbers[i];
                }
            }   
        }
        
        return answer;
    }
}