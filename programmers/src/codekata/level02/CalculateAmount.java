package codekata.level02;

/* 부족한 금액 계산하기 */
class CalculateAmount {
    public long solution(int price, int money, int count) {
        long answer = 0L;
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        if (sum <= money) return 0;

        return sum - money;
    }
}
