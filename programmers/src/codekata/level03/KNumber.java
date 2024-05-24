package codekata.level03;

import java.util.Arrays;

/* K 번째수 */
class KNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i=0; i<commands.length; i++) {
            int[] copyArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(copyArr);
            answer[i] = copyArr[commands[i][2] - 1];
        }
        return answer;
    }
}
