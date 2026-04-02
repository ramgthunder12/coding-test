class Solution {
    //[19, 498,  258, 587]
    //[63,  93,    7, 754]
    //[258,  7, 1000, 723]
    //[587, 754, 723,  81]
    //0,1 != 1,0
    //1,2 == 2,1
    
    //[  5, 192,  33], 
    //[192,  72,  95], 
    //[ 33,  95, 999]
    public int solution(int[][] arr) {
        int answer = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1 + i; j < arr.length; j++) {
                if(arr[i][j] != arr[j][i]) {  
                    answer = 0;
                }
            }
        }
        return answer;
    }
}