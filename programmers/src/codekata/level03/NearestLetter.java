package codekata.level03;

import java.util.Arrays;

/* 가장 가까운 글자 */
class NearestLetter {
    public int[] solution(String str) {
        int[] answer = new int[str.length()];

        for (int i=0; i<str.length(); i++) {
            int index = str.indexOf(str.charAt(i));

            String subStr = str.substring(0, i);
            int duplicateChar = subStr.indexOf(str.charAt(i));
            if (duplicateChar == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - subStr.lastIndexOf(str.charAt(i));
            }
        }

        return answer;
    }
}
