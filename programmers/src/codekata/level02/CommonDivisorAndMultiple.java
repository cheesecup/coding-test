package codekata.level02;

/* 최대공약수와 최소공배수 */
class CommonDivisorAndMultiple {
    public int[] solution(long n, long m) {
        int[] answer = new int[2];

        // n, m 크기 비교
        long max = Math.max(n, m);
        long min = Math.min(n, m);

        // 작은 수 크기 만큼 1씩 감소 시키면서 두 수 모두 나머지가 0이 되는 수 찾은 후 break => 최대공약수
        long divisor = 0L;
        for (long i = min; i > 0; i--) {
            if (n % i == 0 && m % i ==0) {
                divisor = i;
                answer[0] = (int) divisor;
                break;
            }
        }

        // n / 최대공약수 * m / 최대공약수 * 최대공약수 => 최소공배수
        answer[1] = (int) ((n * m) / divisor);
        return answer;
    }
}
