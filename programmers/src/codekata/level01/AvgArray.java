package codekata.level01;

/* 배열의 평균값 */
public class AvgArray {
    public double solution(int[] numbers) {
        double answer = 0.0;

        int cnt = 0;
        int sum = 0;
        for (int num : numbers) {
            sum += num;
            cnt++;
        }

        return (double) sum / cnt;
    }
}
