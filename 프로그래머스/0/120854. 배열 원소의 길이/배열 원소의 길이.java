class Solution {
    public int[] solution(String[] strlist) {
        //배열을 확인한다.
        //문자열의 길이를 answer에 넣는다.
        int[] answer = new int[strlist.length];
        
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}