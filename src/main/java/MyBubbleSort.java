import java.util.Arrays;

public class MyBubbleSort {
    public static String[] sort(String[] array) {
        int size = array.length;
        String[] sorting = Arrays.copyOfRange(array, 0, size);
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size - 1; k++) {
                if (sorting[k].length() > sorting[k + 1].length()) {
                    String temp = sorting[k];
                    sorting[k] = sorting[k + 1];
                    sorting[k + 1] = temp;
                }
            }
        }
        return sorting;
    }
}
