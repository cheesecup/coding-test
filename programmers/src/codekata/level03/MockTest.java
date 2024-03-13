package codekata.level03;

import java.util.*;

/* 모의고사 */
class MockTest {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int sumOne = 0;
        int sumTwo = 0;
        int sumThree = 0;
        for (int i=0; i<answers.length; i++) {
            int oneIdx = i % 5;
            if (answers[i] == one[oneIdx]) sumOne++;

            int twoIdx = i % 8;
            if (answers[i] == two[twoIdx]) sumTwo++;

            int threeIdx = i % 10;
            if (answers[i] == three[threeIdx]) sumThree++;
        }

        int[] arr = new int[]{sumOne, sumTwo, sumThree};
        Arrays.sort(arr);

        int max = arr[2];
        List<Integer> list = new ArrayList<>();
        if (sumOne == max) list.add(1);
        if (sumTwo == max) list.add(2);
        if (sumThree == max) list.add(3);

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);

        return answer;
    }
}
