package codekata.level02;

/* 약수의 개수와 덧셈 */
class Factors {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            answer += (i % Math.sqrt(i) == 0) ? -i : i;
        }

        return answer;
    }
}
