package se.lexicon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;

public class MergeLists {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listB = new ArrayList<>(
                Arrays.asList(3, 4, 5, 6, 7));
        LinkedHashSet<Integer> mergedNumbers = new LinkedHashSet<>(listA);
        mergedNumbers.addAll(listB);
        System.out.println("Merged numbers: " + mergedNumbers);
        System.out.println("Total unique numbers: " + mergedNumbers.size());
    }
}
