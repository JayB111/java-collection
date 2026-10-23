package se.lexicon;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
public class StudentGrades {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Anna", 85);
        grades.put("Bob", 72);
        grades.put("Charlie", 94);
        grades.put("David", 68);
        grades.put("Eva", 90);
        grades.put("Fiona", 78);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String studentName = scanner.nextLine();
        if (grades.containsKey(studentName)) {
            System.out.println(studentName + "'s grade: " + grades.get(studentName));
        } else {
            System.out.println("Student not found.");
        }
        List<Map.Entry<String, Integer>> sortedGrades =
                new ArrayList<>(grades.entrySet());
        sortedGrades.sort(
                Map.Entry.comparingByValue(Comparator.reverseOrder())
        );
        System.out.println("Students sorted by grade:");
        for (Map.Entry<String, Integer> entry : sortedGrades) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}