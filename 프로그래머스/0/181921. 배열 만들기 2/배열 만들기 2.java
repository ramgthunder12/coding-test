import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        // 최대 1,000,000 → 555555 (6자리) → 2진수 6비트면 충분
        for (int i = 1; i < (1 << 7); i++) {
            String binary = Integer.toBinaryString(i);
            StringBuilder sb = new StringBuilder();

            for (char c : binary.toCharArray()) {
                sb.append(c == '1' ? '5' : '0');
            }

            int num = Integer.parseInt(sb.toString());

            if (num >= l && num <= r) {
                list.add(num);
            }
        }

        Collections.sort(list);

        return list.isEmpty() ? new int[]{-1}
                              : list.stream().mapToInt(Integer::intValue).toArray();
    }
}
