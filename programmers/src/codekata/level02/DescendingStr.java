package codekata.level02;

import java.util.*;

/* 문자열 내림차순 배치하기 */
class DescendingStr {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        return new StringBuilder(new String(arr)).reverse().toString();
    }
}
