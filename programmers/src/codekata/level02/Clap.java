package codekata.level02;

/* 수박수박수박수박 */
class Clap {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            sb.append((i % 2 == 0) ? "수" : "박");
        }

        return sb.toString();
    }
}
