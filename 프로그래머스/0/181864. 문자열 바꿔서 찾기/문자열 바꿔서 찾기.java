class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        pat = pat.replaceAll("A", "b");
        pat = pat.replaceAll("B", "a");
        pat = pat.toUpperCase();
        if(myString.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}