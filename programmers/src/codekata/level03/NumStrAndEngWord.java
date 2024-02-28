package codekata.level03;

/* 숫자 문자열과 영단어 */
class NumStrAndEngWord {
    public int solution(String s) {
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i=0; i<10; i++) {
            String iStr = String.valueOf(i);
            s = s.replaceAll(numStr[i], iStr);
        }

        return Integer.parseInt(s);
    }
}
