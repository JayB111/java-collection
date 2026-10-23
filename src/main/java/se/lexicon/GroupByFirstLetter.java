package se.lexicon;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Alice", "Bob", "Anna", "Charlie",
                "Brian", "Amanda", "Carl"
        );
        Map<Character, List<String>> groups = new HashMap<>();
        for (String name : names) {
            char firstLetter = name.charAt(0);
            groups.putIfAbsent(firstLetter, new ArrayList<>());
            groups.get(firstLetter).add(name);
        }
        System.out.println(groups);
    }
}
