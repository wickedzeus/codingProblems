import java.util.List;

public class validateSubsequence {
    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        if(sequence.size() > array.size()) return false;
        int sequencePosition = 0;
        for(int n : array) {
            if(sequence.get(sequencePosition).equals(n)) {
                sequencePosition++;
            }
            if(sequencePosition == sequence.size()) return true;
        }
        return false;
    }
}
