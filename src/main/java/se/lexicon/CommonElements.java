package se.lexicon;

import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
public class CommonElements {
    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> listB = Arrays.asList(3, 6, 9, 12, 15);
        HashSet<Integer> common = new HashSet<>(listA);
        common.retainAll(listB);
        common.retainAll(listB);
        System.out.println("Common elements: " + common);
    }
}
