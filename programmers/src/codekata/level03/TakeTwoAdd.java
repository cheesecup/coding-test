package codekata.level03;

import java.util.HashSet;
import java.util.Set;

/* 두 개 뽑아서 더하기 */
class TakeTwoAdd {
    public int[] solution(int[] numbers) {
        Set<Integer> sum = new HashSet<>();
        for (int i=0; i<numbers.length - 1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                sum.add(numbers[i] + numbers[j]);
            }
        }

        return sum.stream().mapToInt(i -> i).sorted().toArray();
    }
}
