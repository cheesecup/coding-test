package codekata.level02;

/* 정수 제곱근 판별 */
class IntSqrt {
    public long solution(long n) {
        long answer = 0;
        long x = (long) Math.sqrt(n);
        if (x == Math.sqrt(n)) {
            answer = (long) Math.pow(x+1, 2);
        } else {
            answer = -1;
        }

        return answer;
    }
}
