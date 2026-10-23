package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] numbers = {4, 7, 2, 7, 9, 4, 1, 9, 3};
        LinkedHashSet<Integer> uniqueNumbers =
                new LinkedHashSet<>(Arrays.asList(numbers));
        List<Integer> result = new ArrayList<>(uniqueNumbers);
        System.out.println(result);
    }
}