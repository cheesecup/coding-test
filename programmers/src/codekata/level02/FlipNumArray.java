package codekata.level02;

/* 자연수 뒤집어 배열로 만들기 */
class FlipNumArray {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] arr = new int[num.length()];

        int i = 0;
        while(true) {
            arr[i] = (int) n % 10;
            n = n / 10;
            if (n == 0) break;
            i++;
        }

        return arr;
    }
}
