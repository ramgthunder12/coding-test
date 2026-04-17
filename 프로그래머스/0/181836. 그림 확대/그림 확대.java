import java.lang.StringBuilder;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;

        for (String row : picture) {
            StringBuilder sb = new StringBuilder();

            // 가로 k배
            for (char c : row.toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }

            String newRow = sb.toString();

            // 세로 k배
            for (int i = 0; i < k; i++) {
                answer[idx++] = newRow;
            }
        }

        return answer;
    }

//     public String[] solution(String[] picture, int k) {
//         String[] answer = new String[picture.length * k];
//         int count = 0;
        
//         for(int j = 0; j < picture.length; j++) {
//             for(int i = 0; i < k; i++) {
//                 answer[count++] = repeat(picture[j], k);
//             }
//         }
//         return answer;
//     }
    
   public String repeat(String str, int k) {
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < str.length(); i++) {
           for(int j = 0; j < k; j++) {
               sb.append(str.charAt(i));
           }
       }
       return sb.toString();
   }
}