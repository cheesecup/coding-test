package codekata.level03;

/* 2016년 */
class LeapYear {
    public String solution(int a, int b) {
        String answer = "";
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int sum = 0;
        for (int i=0; i<a-1; i++) {
            sum += days[i];
        }
        sum += b;

        int remain = sum % 7;
        answer = week[remain];

        return answer;
    }
}
