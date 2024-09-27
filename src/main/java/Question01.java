public class Question01 {

    public static int[] solution(int[] arr) {
        int length = arr.length;
        int minValue = arr[0];
        int[] returnArray = new int[length - 1];

        if (length == 1) {
            return new int[]{-1};
        }

        for (int i : arr) {
            if (i < minValue) {
                minValue = i;
            }
        }

        for (int j = 0, pointer = 0; j < length; j++) {
            if (arr[j] != minValue) {
                returnArray[pointer++] = arr[j];
            }
        }

        return returnArray;
    }

}
