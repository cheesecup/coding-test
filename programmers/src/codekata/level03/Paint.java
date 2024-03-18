package codekata.level03;

import java.util.Arrays;

/**
 * n = 벽의 길이
 * m = 룰러의 길이
 * section = 다시 칠해야 하는 구역의 번호가 담긴 배열
 */
class Paint {

    /*
    * n의 길이를 가진 배열 생성
    * 생성된 배열에서 section 배열의 값을 인덱스로 가진 요소의 값을 1로 변경
    * m의 길이 만큼 section 탐색
    * 1234 / 2345 / 3456 / 4567 / 5678
    * 1234 2345
    * */
    public int solution(int n, int m, int[] section) {
        int answer = 1;

        int start = section[0];
        for (int num : section) {
            if (num < start + m) continue;
            answer++;
            start = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        System.out.println(paint.solution(8,4, new int[]{2,3,6}));
        System.out.println(paint.solution(5,4, new int[]{1,3}));
        System.out.println(paint.solution(4,1, new int[]{1,2,3,4}));
    }
}
