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

    public static void main(String[] args) {
        Average average = new Average();
        System.out.println(average.solution(new int[]{1,2,3,4}));
        System.out.println(average.solution(new int[]{5,5}));
    }
}
