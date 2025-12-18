import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> participantMap = new HashMap<>();
        
        for(String person : participant) {
            participantMap.put(person, participantMap.getOrDefault(person, 0) + 1);
        }
        
        for(String person : completion) {
            participantMap.put(person, participantMap.get(person) - 1);
        }
        
        for(String person : participantMap.keySet()) {
            if(participantMap.get(person) > 0) {
                answer = person;
            }
        }
          
        return answer;
    }
}