class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            String[] quizeSplit = quiz[i].split(" ");
            //0 1 2 3 4
            //3 - 4 = -3
            int num1 = Integer.parseInt(quizeSplit[0]);
            int num2 = Integer.parseInt(quizeSplit[2]);
            int numResult = Integer.parseInt(quizeSplit[4]);
            int numRealResult = 0;
            if(quizeSplit[1].equals("-")) {
                numRealResult = num1 - num2;
            } else {
                numRealResult = num1 + num2;
            }
            
            if(numRealResult == numResult) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}