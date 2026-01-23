class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int carry = 0;
        int len = 0;
        if(bin1.length() > bin2.length()) {
            len = bin1.length();
        } else {
            len = bin2.length();
        }
        for(int i = 1; i <= len; i++) {
            int current = 0;
            int bin1Int = 0;
            int bin2Int = 0;
            if(bin1.length() - i < 0) {
                bin1Int = 0;
            } else {
                bin1Int = (int)(bin1.charAt(bin1.length() - i) - '0');
            }
            if(bin2.length() - i < 0) {
                bin2Int = 0;
            } else {
                bin2Int = (int)(bin2.charAt(bin2.length() - i) - '0');
            }
            System.out.println(bin1Int + ":" + bin2Int);
            if(bin1Int == bin2Int) {
                //앞에 1올라가고 자리수 0
                //00일때
                //자리수 0
                if(bin1Int == 1) {
                    if(carry == 1) {
                        answer = 1 + answer;
                    } else {
                        answer = 0 + answer;    
                    }
                    carry = 1;
                } else {
                    if(carry == 1) {
                        answer = 1 + answer;
                        carry = 0;
                    } else {
                        answer = 0 + answer;
                    }
                }
            } else {
                //자리수 1
                if(carry == 1) {
                    answer = 0 + answer;
                } else {
                    answer = 1 + answer;    
                }
            }
        }
        if(carry == 1) {
            answer = 1 + answer;
        }
        return answer;
    }
}