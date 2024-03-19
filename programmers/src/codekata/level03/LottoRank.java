package codekata.level03;

/* 로또 최고 순위와 최저 순위 */
class LottoRank {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }

            for (int winNum : win_nums) {
                if (winNum == lottos[i]) {
                    cnt++;
                    break;
                }
            }
        }

        switch (cnt + zeroCnt) {
            case 0:
            case 1: answer[0] = 6;
                break;
            case 2: answer[0] = 5;
                break;
            case 3: answer[0] = 4;
                break;
            case 4: answer[0] = 3;
                break;
            case 5: answer[0] = 2;
                break;
            case 6: answer[0] = 1;
                break;
        }

        switch (cnt) {
            case 0:
            case 1: answer[1] = 6;
                break;
            case 2: answer[1] = 5;
                break;
            case 3: answer[1] = 4;
                break;
            case 4: answer[1] = 3;
                break;
            case 5: answer[1] = 2;
                break;
            case 6: answer[1] = 1;
                break;
        }

        return answer;
    }
}
