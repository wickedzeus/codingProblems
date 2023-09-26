import java.util.*;

public class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        if(coins.length == 0) return 1;

        List<Integer> upgradedArray = new ArrayList<>(Arrays.stream(coins).boxed().toList());
        upgradedArray.sort(Comparator.naturalOrder());

        int totalChange = 0;

        for(Integer number : upgradedArray) {
            if(number > totalChange + 1) return totalChange + 1;
            totalChange += number;
        }

        return totalChange + 1;
    }
}
