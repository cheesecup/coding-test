package codekata.level02;

/* 문자열 다루기 */
class StringHandling {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (Character.isAlphabetic(c)) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StringHandling stringHandling = new StringHandling();
        System.out.println(stringHandling.solution("a234"));
        System.out.println(stringHandling.solution("1234"));
        System.out.println(stringHandling.solution("12345"));
        System.out.println(stringHandling.solution("a2345"));
    }
}
