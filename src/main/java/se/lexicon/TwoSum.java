package se.lexicon;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
public class TwoSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, 11, 15, 4, 6);
        int target = 13;
        HashSet<Integer> seen = new HashSet<>();
        for (int number : numbers) {
            int needed = target - number;

            if (seen.contains(needed)) {
                System.out.println("Pair found: " + needed + " + " + number
                        + " = " + target);
            }
            seen.add(number);
        }
    }
}
