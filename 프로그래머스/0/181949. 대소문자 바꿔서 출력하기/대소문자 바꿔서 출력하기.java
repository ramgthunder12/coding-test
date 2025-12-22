import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            int c = b;
            if(c > 94) {
                //소문자 -> 대문자
                answer = answer + Character.toUpperCase(b);
            } else {
                //대문자 –> 소문자
                answer = answer + Character.toLowerCase(b);
            }
        }
        System.out.println(answer);
    }
}