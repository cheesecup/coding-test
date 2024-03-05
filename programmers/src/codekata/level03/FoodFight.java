package codekata.level03;

class FoodFight {
    public String solution(int[] food) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<food.length; i++) {
            int cnt = food[i] / 2;
            for (int j=0; j<cnt; j++) {
                sb.append(String.valueOf(i));
            }
        }
        String left = sb.toString() + "0";
        String right = sb.reverse().toString();

        return left + right;
    }
}
