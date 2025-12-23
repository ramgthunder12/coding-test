class Solution {
    public int solution(int hp) {
        int answer = 0;
        //장군 개미로 hp를 나눈 나머지와 몫 구하기
        //만약 나머지가 있으면 병정개미로 hp 나눈 나머지와 몫
        //만약 나머지가 있으면 일개밀로 hp 나눈 몫 구하기
        //General ants, soldier ants, worker ants
        
        int generalAnt = 5;
        int soldierAnt = 3;
        int workerAnt = 1;
        //1. hp 가 0 이면 result 값 0
        //2. hp를 장군으로 나눈값을 result에 저장하기
        //3. 만약 hp를 장군으로 나눈 나머지가 있는지 확인하기
        //4. 있다면 그 나머지값을 병정으로 나누기
        //5. 그 나눈값을 result에 추가하기
        //6. 만약 그 나머지값을 병정으로 나눈 나머지가 있는지 확인하기
        //7. 있다면 그 나머지를 일게미로 나눈값을 result에 추가하기
        int namerge2 = 0;
        if(hp == 0) {
            return 0;
        }
        
        answer = hp / generalAnt;
        int namerge = hp % generalAnt;
        if(namerge != 0) {
            //4.있다면 그 나머지값을 병정으로 나누기
            answer = answer + (namerge / soldierAnt);
            namerge2 = namerge % soldierAnt;
            if(namerge2 != 0) {
                answer = answer + namerge2 / workerAnt;
            }
        }
        return answer;
    }
}