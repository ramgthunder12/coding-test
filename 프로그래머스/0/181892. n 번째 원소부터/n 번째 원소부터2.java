import java.util.Arrays;

class Soulution{
    public int[] soution(int[] num_list, int n) {
        int[] answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        return answer;
    }
}
