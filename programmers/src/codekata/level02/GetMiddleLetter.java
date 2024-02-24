package codekata.level02;

/* 가운데 글자 가져오기 */
class GetMiddleLetter {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        if (len % 2 == 0) {
            answer += s.substring(len / 2 - 1, len / 2 + 1);
        } else {
            answer += s.charAt(len / 2);
        }

        return answer;
    }
}
