class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int hMax = 0;
        int wMax = 0;
        for(int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];
            if(w < h) {
                int temp = w;
                w = h;
                h = temp;
            }
            
            if(wMax < w) {
                wMax = w;
            }
            if(hMax < h) {
                hMax = h;
            }
        }
        answer = wMax * hMax;
        return answer;
    }
}