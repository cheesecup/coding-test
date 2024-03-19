package codekata.level03;

/* 덧칠하기 */
class Paint {
    public int solution(int n, int m, int[] section) {
        int answer = 1;

        int start = section[0];
        for (int num : section) {
            if (num < start + m) continue;
            answer++;
            start = num;
        }

        return answer;
    }
}
