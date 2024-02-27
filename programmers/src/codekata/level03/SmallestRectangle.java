package codekata.level03;

import java.util.Arrays;

/* 최소 직사각형 */
class SmallestRectangle {
    public int solution(int[][] sizes) {
        for (int[] size : sizes) {
            Arrays.sort(size);
        }

        int a = 0;
        int b = 0;
        for (int[] size : sizes) {
            if (size[0] > a) a = size[0];
            if (size[1] > b) b = size[1];
        }

        return a * b;
    }
}
