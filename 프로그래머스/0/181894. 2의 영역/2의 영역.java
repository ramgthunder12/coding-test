class Solution {
    public int[] solution(int[] arr) {
        int first2 = 0;
        boolean firstFlug = true;
        int last2 = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                if(firstFlug) {
                    first2 = i;
                    firstFlug = false;
                } else {
                    last2 = i;
                }
            }    
        }
        
        if(last2 == 0) {
            if(firstFlug) {
                int[] answer = {-1};
                return answer;    
            }
            last2 = first2;
        }
        
        int len = last2 - first2 + 1;
        int[] answer = new int[len];
        int count = 0;
        
        for(int i = first2; i <= last2; i++) {
            answer[count++] = arr[i];
        }
        
        return answer;
    }
}