class Solution {
    public int solution(String[] spell, String[] dic) {
        //배열
        //dic원소 1개에서, spell원소 1개가 있는지 확인한다.
        //없으면 바로 다음 dic으로 넘어간다.
        //있으면 다음 spell을 검사한다. 
        //모든 spell이 있으면 answer에서 1을 뺀다.
        //그리고 종료한다.
        int answer = 2;
        int count = 0;
        
        for(int i = 0; i < dic.length; i++) {
            for(int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j])) {
                    count++;
                } else {
                    break;
                }
            }
            if(spell.length == count) {
                answer--;
                break;
            }
            count = 0;
        }
        
        return answer;
    }
}