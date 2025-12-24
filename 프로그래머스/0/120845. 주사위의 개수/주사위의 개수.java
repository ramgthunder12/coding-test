class Solution {
    //10 8 6
    //9 6 6
    //10/3 * 3, 8/3 * 3, 6/3 * 3
    //3 2 2
    //width, length, height
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int width = box[0];
        int length = box[1];
        int height = box[2];
        
        answer = (width / n) * (length / n) * (height / n);
        return answer;
    }
}