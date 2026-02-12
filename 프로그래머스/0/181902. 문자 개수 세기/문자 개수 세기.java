class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(char c : my_string.toCharArray()) {
            //System.out.println((int)'z' + 1);//A 65, Z 90, a 97, z 122, 26개
            if(65 <= c && c <= 90) {
                answer[(int) c - 'A']++;
            } else if(97 <= c && c <= 122) {
                answer[26 + (int) c - 'a']++;
            } else {
                System.out.println("영어가 아닌 다른게 있습니다.");
            }
        }
        return answer;
    }
}