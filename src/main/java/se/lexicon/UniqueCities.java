package se.lexicon;
import java.util.HashSet;

public class UniqueCities {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Stockholm");
        cities.add("Gothenburg");
        cities.add("Malmö");
        cities.add("Stockholm");
        cities.add("Uppsala");
        cities.add("Gothenburg");
        cities.add("Lund");
        System.out.println("Unique cities: " + cities);
        System.out.println("Number of unique cities: " + cities.size());
    }
}