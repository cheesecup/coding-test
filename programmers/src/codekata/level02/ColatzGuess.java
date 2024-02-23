package codekata.level02;

/* 콜라츠 추측 */
class ColatzGuess {
    public int solution(int smallNum) {
        int cnt = 0;
        long num = smallNum;
        while (cnt <= 500) {
            if (num ==1) break;

            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
            cnt++;
        }

        if (num != 1) return -1;

        return cnt;
    }
}
