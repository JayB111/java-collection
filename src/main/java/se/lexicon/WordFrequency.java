package se.lexicon;
import java.util.HashMap;
import java.util.TreeMap;
public class WordFrequency {
    public static void main(String[] args) {
        String text = "coffee tea coffee milk tea coffee";
        String[] words = text.split(" ");
        TreeMap<String, Integer> wordCounts = new TreeMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}