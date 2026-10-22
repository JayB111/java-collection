package se.lexicon;
import java.util.ArrayList;
import java.util.Scanner;

public class CountByLetter {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");
        names.add("Amanda");
        names.add("David");
        names.add("Amy");
        names.add("Brian");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = scanner.nextLine();
        int count = 0;
        for (String name : names) {
            if (name.toLowerCase().startsWith(letter.toLowerCase())) {
                count++;
            }
        }
        System.out.println("Number of names starting with " + letter + ": " + count);

    }
}