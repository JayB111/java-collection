package se.lexicon;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "cat", "dog", "cat", "bird", "dog",
                "cat", "fish", "dog", "dog"
        );
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        String mostFrequent = "";
        int highestCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > highestCount) {
                mostFrequent = entry.getKey();
                highestCount = entry.getValue();
            }
        }
        System.out.println("Most frequent word: " + mostFrequent);
        System.out.println("Count: " + highestCount);
    }
}
