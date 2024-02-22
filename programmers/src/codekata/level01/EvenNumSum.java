package codekata.level01;

/* 짝수의 합 */
public class EvenNumSum {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) answer += i;
        }

        return answer;
    }
}
