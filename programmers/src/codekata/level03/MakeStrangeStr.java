package codekata.level03;

import java.util.Arrays;

/* 이상한 문자 만들기 */
class MakeStrangeStr {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        char[] arr = s.toCharArray();

        int cnt = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == ' ') {
                cnt = 0;
                continue;
            }

            if (cnt % 2 == 0) {
                arr[i] -= 32;
            }
            cnt++;
        }
        answer = new String(arr);

        return answer;
    }
}
