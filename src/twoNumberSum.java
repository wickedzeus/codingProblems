import java.util.Arrays;

public class twoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int n : array) {
            int neededValue = targetSum - n;
            if(neededValue != n && arrayContains(array, neededValue)) return new int[]{n, neededValue};
        }

        return new int[0];
    }

    public static boolean arrayContains(int[] array, int value) {
        for(int n : array) {
            if(n == value) return true;
        }
        return false;
    }
}
