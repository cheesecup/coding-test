package codekata.level03;

import java.util.*;

/* 카드 뭉치 */
class PackOfCards {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        List<String> cardsList1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> cardsList2 = new ArrayList<>(Arrays.asList(cards2));

        for (int i=0; i<goal.length; i++) {
            if (!cardsList1.isEmpty() && cardsList1.get(0).equals(goal[i])) {
                cardsList1.remove(goal[i]);
            } else if (!cardsList2.isEmpty() && cardsList2.get(0).equals(goal[i])) {
                cardsList2.remove(goal[i]);
            } else {
                return "No";
            }
        }

        return answer;
    }
}
