package codekata.level02;

import java.util.Arrays;

/* 정수 내림차순으로 배치하기 */
class IntDesc {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i=arr.length - 1; i>=0; i--) {
            sb.append(arr[i]);
        }

        return Long.parseLong(sb.toString());
    }
}
