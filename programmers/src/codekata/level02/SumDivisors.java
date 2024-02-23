package codekata.level02;

/* 약수의 합 */
class SumDivisors {
    private int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
