package codekata.level02;

import java.util.*;

/* 제일 작은 수 제거하기 */
class RemoveSmallNum {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        int min = arr[0];

        List<Integer> list = new ArrayList<>();
        for (int i : copyArr) {
            if (i != min) list.add(i);
        }

        return list.stream().mapToInt(i ->i).toArray();
    }
}
