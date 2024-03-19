package codekata.level03;

/* 기사단원의 무기 */
class TemplarWeapon {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i=1; i<=number; i++) {
            int cnt = 0;
            for (int j=1; j<=Math.sqrt(i); j++) {
                if (j * j == i) {
                    cnt++;
                } else if (i % j == 0) {
                    cnt += 2;
                }
            }

            if (limit < cnt) cnt = power;

            answer += cnt;
        }

        return answer;
    }
}
