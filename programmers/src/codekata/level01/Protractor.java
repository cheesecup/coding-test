package codekata.level01;

/* 각도기 */
public class Protractor {
    public int solution(int angle) {
        if (0 < angle && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (90 < angle && angle < 180) {
            return 3;
        } else {
            return 4;
        }
    }
}
