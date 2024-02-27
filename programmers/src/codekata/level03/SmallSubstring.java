package codekata.level03;

/* 크기가 작은 부분 문자열 */
class SmallSubstring {
    public int solution(String t, String p) {
        int answer = 0;

        long longP = Long.parseLong(p);
        int loopLen = t.length() - p.length() + 1;
        for (int i = 0 ; i<loopLen; i++) {
            String tmp = t.substring(i, p.length() + i);
            answer += (Long.parseLong(tmp) <= longP) ? 1 : 0;
        }

        return answer;
    }
}
