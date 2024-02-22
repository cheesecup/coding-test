package codekata.level02;

/* 평균 구하기 */
public class Average {
    public double solution(int[] arr) {
        int sum = 0;
        int cnt = 0;
        for (int num : arr) {
            sum += num;
            cnt++;
        }

        return (double) sum / cnt;
    }
}
