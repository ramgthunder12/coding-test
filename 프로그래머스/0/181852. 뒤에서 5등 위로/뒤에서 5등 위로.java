import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
//         Arrays.sort(num_list);
//         int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        
        int n = num_list.length;

        // 선택 정렬
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (num_list[j] < num_list[minIdx]) {
                    minIdx = j;
                }
            }

            // swap
            int temp = num_list[i];
            num_list[i] = num_list[minIdx];
            num_list[minIdx] = temp;
        }

        // 앞 5개 제외하고 결과 생성
        int[] answer = new int[n - 5];
        for (int i = 5; i < n; i++) {
            answer[i - 5] = num_list[i];
        }

        
        return answer;
    }
}