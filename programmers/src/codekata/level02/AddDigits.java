package codekata.level02;

/* 자릿수 더하기 */
public class AddDigits {
    public int solution(int n) {
        int answer = 0;
        do {
            answer += n % 10;
            n = n / 10;
        } while (n != 0);

        return answer;
    }
}
