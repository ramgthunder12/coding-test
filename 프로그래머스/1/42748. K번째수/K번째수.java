import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int commandsLength = commands.length;
        int[] answer = new int[commandsLength];
        //commmands에 i, j, k들어 있음
        //i번째 부터 j번째 까지 => 인덱스로 i + 1 부터 j + 1 까지
        //정렬
        // k 번째 수를 배열에 담기
        
        // comands 첫번째 배열 길이 찾기
        //1. comands 첫번째 배열 길이 만큼 반복하기
        //2. comands의 j - i + 1 의 크기인 result 배열을 생성하기
        //3. array의 인덱스 i - 1 부터 j까지 잘라서 result 배열에 넣기
        //4. result 배열 정렬하기
        //5. result 배열에 인덱스 k- 1의 값을  answer에 담기
        
        for(int h = 0; h < commandsLength; h++) {
            int i = commands[h][0];
            int j = commands[h][1];
            int k = commands[h][2];
            
            int[] result = new int[j - i + 1];
            result = Arrays.copyOfRange(array, i - 1, j);
            
            Arrays.sort(result);
            answer[h] = result[k - 1];
        }
        return answer;
    }
}