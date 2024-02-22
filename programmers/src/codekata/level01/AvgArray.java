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

    public static void main(String[] args) {
        AvgArray avgArray = new AvgArray();
        double result = avgArray.solution(new int[]{89,90,91,92,93,94,95,96,97,98,99});
        System.out.println(result);
    }
}
