import java.util.Arrays;

public class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        int[] outputArray = new int[array.length];
        for(int n = 0; n < array.length; n++) {
            outputArray[n] = array[n] * array[n];
        }
        Arrays.sort(outputArray);
        return outputArray;
    }
}
