import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] startTemp = Arrays.copyOfRange(num_list, 0, n);
        int[] endTemp = Arrays.copyOfRange(num_list, n, num_list.length);
        
        for(int i = 0; i < num_list.length - n; i++) {
            answer[i] = endTemp[i];
        }
        
        int count = 0;
        for(int i = endTemp.length; i < num_list.length; i++) {
            answer[i] = startTemp[count++];
        }
        System.out.println(Arrays.toString(startTemp));
        System.out.println(Arrays.toString(endTemp));
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}