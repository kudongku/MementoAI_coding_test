import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] QUESTION01_ANSWER01 = Question01.solution(new int[]{4, 3, 2, 1});
        int[] QUESTION01_ANSWER02 = Question01.solution(new int[]{10});
        int[] QUESTION01_ANSWER03 = Question01.solution(new int[]{5, 3, 1, 4, 2});

        System.out.println("QUESTION01_ANSWER01 = " + Arrays.toString(QUESTION01_ANSWER01));
        System.out.println("QUESTION01_ANSWER02 = " + Arrays.toString(QUESTION01_ANSWER02));
        System.out.println("QUESTION01_ANSWER03 = " + Arrays.toString(QUESTION01_ANSWER03)+ "\n");

        String QUESTION02_ANSWER01 = Question02.solution("Zbcdefg");
        String QUESTION02_ANSWER02 = Question02.solution("abcXYZxyzABC");

        System.out.println("QUESTION02_ANSWER01 = " + QUESTION02_ANSWER01);
        System.out.println("QUESTION02_ANSWER02 = " + QUESTION02_ANSWER02);
    }

}
