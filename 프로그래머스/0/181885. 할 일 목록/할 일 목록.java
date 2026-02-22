class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int len = 0;
        
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                len++;
            }    
        }
        
        answer = new String[len];
        int count = 0;
        for(int i = 0; i < finished.length; i++) {
           if(!finished[i]) {
                answer[count++] = todo_list[i];
            }    
        }
        return answer;
    }
}