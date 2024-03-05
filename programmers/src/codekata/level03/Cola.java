package codekata.level03;

/* 콜라문제 */
class Cola {
    public int solution(int a, int b, int n) {
        int answer = 0;

        int newCola = 0;
        while (n >= a) {
            newCola = (n / a) * b;
            answer += newCola;
            n = (n % a) + newCola;
        }

        return answer;
    }
}
