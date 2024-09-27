import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] answer01 = Question01.solution(new int[]{4,3,2,1});
        int[] answer02 = Question01.solution(new int[]{10});
        int[] answer03 = Question01.solution(new int[]{5,3,1,4,2});

        System.out.println("answer01 = " + Arrays.toString(answer01));
        System.out.println("answer02 = " + Arrays.toString(answer02));
        System.out.println("answer03 = " + Arrays.toString(answer03));

        String QUESTION02_ANSWER01 = Question02.solution("Zbcdefg");
        String QUESTION02_ANSWER02 = Question02.solution("abcXYZxyzABC");

        System.out.println("QUESTION02_ANSWER01 = " + QUESTION02_ANSWER01);
        System.out.println("QUESTION02_ANSWER02 = " + QUESTION02_ANSWER02);
    }

}
