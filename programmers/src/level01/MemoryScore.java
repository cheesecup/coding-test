package level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 추억 점수 */
class MemoryScore {
    private static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> score = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }

        for (int i=0; i<photo.length; i++) {
            for (int j=0; j<photo[i].length; j++) {
                if (score.containsKey(photo[i][j])) {
                    answer[i] += score.get(photo[i][j]);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] name1 = new String[]{"may", "kein", "kain", "radi"};
        int[] yearning1 = new int[]{5,10,1,3};
        String[][] photo1 = new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] answer1 = MemoryScore.solution(name1, yearning1, photo1);
        System.out.println(Arrays.toString(answer1));

        String[] name2 = new String[]{"kali", "mari", "don"};
        int[] yearning2 = new int[]{11,1,55};
        String[][] photo2 = new String[][]{{"kali", "mari", "don"},{"pony", "tom", "teddy"}, {"con", "mona", "don"}};

        int[] answer2 = MemoryScore.solution(name2, yearning2, photo2);
        System.out.println(Arrays.toString(answer2));

        String[] name3 = new String[]{"may", "kein", "kain", "radi"};
        int[] yearning3 = new int[]{5,10,1,3};
        String[][] photo3 = new String[][]{{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};

        int[] answer3 = MemoryScore.solution(name3, yearning3, photo3);
        System.out.println(Arrays.toString(answer3));
    }
}
