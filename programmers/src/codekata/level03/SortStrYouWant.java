package codekata.level03;

import java.util.Arrays;

/* 문자열 내 마음대로 정렬하기 */
class SortStrYouWant {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }

        return strings;
    }
}
