package codekata.level03;

/* 시저 암호 */
class CaesarCipher {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == ' ') continue;

            if (Character.isLowerCase(arr[i])) {
                arr[i] = (char) (arr[i] + n);
                if (arr[i] > 'z') {
                    arr[i] = (char) (arr[i] - 26);
                }
            } else {
                arr[i] = (char) (arr[i] + n);
                if (arr[i] > 'Z') {
                    arr[i] = (char) (arr[i] - 26);
                }
            }
        }

        return new String(arr);
    }
}
