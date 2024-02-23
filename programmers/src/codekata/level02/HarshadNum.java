package codekata.level02;

/* 하사드 수 */
class HarshadNum {
    public boolean solution(int x) {
        int tmp = x;
        int sum = 0;
        while(true) {
            sum += x % 10;
            x = x / 10;
            if (x == 0) break;
        }

        if (tmp % sum == 0) return true;

        return false;
    }
}
