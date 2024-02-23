package codekata.level02;

/* 두 정수 사이의 합 */
class SumBetweenInt {
    public long solution(int a, int b) {
        if (a==b) return (long) a;

        long answer = 0L;
        if (a < b) {
            for (long i=a; i<=b; i++) {
                answer += i;
            }
        } else {
            for (long i=b; i<=a; i++) {
                answer += i;
            }
        }

        return answer;
    }
}
