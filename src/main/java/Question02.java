import java.util.Arrays;

public class Question02 {

    public static String solution(String s) {
        StringBuilder returnValue = new StringBuilder();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        for (int i = charArray.length - 1; i >= 0; i--) {
            returnValue.append(charArray[i]);
        }

        return returnValue.toString();
    }

}
