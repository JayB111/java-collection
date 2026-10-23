package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class TopThreeFrequentWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "java", "python", "java", "c++", "python",
                "java", "ruby", "c++", "python", "ruby", "java"
        );
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedWords =
                new ArrayList<>(wordCounts.entrySet());
        sortedWords.sort((first, second) -> {
            int countComparison =
                    second.getValue().compareTo(first.getValue());
            if (countComparison != 0) {
                return countComparison;
            }
            return first.getKey().compareTo(second.getKey());
        });
                System.out.println("Top 3 most frequent words:");
        for (int i = 0; i < 3 && i < sortedWords.size(); i++) {
            Map.Entry<String, Integer> entry = sortedWords.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
