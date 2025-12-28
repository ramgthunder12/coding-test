class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int numProduct = 1;
        int numSumSquare = 0;
        for(int i : num_list) {
            numProduct = numProduct * i;
            numSumSquare = numSumSquare + i;
        }
        numSumSquare = numSumSquare * numSumSquare;
        
        System.out.println(numProduct + " " + numSumSquare);
        if(numProduct < numSumSquare) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}