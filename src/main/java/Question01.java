public class Question01 {

    public static int[] solution(int[] args) {
        int length = args.length;
        int minValue = args[0];
        int[] returnArray = new int[length - 1];

        if (length == 1) {
            return new int[]{-1};
        }

        for (int i : args) {
            if (i < minValue) {
                minValue = i;
            }
        }

        for (int j = 0, pointer = 0; j < length; j++) {
            if (args[j] != minValue) {
                returnArray[pointer++] = args[j];
            }
        }

        return returnArray;
    }

}
