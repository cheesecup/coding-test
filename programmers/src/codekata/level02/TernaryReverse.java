package codekata.level02;

/* 3진법 뒤집기 */
class TernaryReverse {
    public int solution(int n) {
        String answer = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        return Integer.parseInt(answer, 3);
    }
}
