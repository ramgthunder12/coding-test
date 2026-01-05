// z       4
// o       3
// t
//     w   3
//     h   5
// f
//     o   4
//     i   4
// s
//     i   3
//     e   5
// e       5
// n       4
// 첫번째가 zfn 이면 4자 지우기, o이면 3자 지우기, e면 5자 지우기
//replace
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        numbers = numbers.replaceAll("zero", "0");
        numbers = numbers.replaceAll("one", "1");
        numbers = numbers.replaceAll("two", "2");
        numbers = numbers.replaceAll("three", "3");
        numbers = numbers.replaceAll("four", "4");
        numbers = numbers.replaceAll("five", "5");
        numbers = numbers.replaceAll("six", "6");
        numbers = numbers.replaceAll("seven", "7");
        numbers = numbers.replaceAll("eight", "8");
        numbers = numbers.replaceAll("nine", "9");

        answer = Long.parseLong(numbers);
        return answer;
    }
}