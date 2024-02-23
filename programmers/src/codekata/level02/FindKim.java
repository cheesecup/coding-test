package codekata.level02;

/* 서울에서 김서방 찾기 */
class FindKim {
    public String solution(String[] seoul) {
        String answer = "";
        int cnt = 0;
        for (String s : seoul) {
            if (s.equals("Kim")) {
                answer = "김서방은 " + cnt + "에 있다";
                break;
            }
            cnt++;
        }
        return answer;
    }
}
