package se.lexicon;
import java.util.HashSet;

public class SubmissionTracker {
    public static void main(String[] args) {
        HashSet<String> submissions = new HashSet<>();
        if (submissions.add("Anna")) {
            System.out.println("Anna submitted successfully.");
        } else {
            System.out.println("Submission rejected: Anna has already submitted.");
        }
        if (submissions.add("Bob")) {
            System.out.println("Bob submitted successfully.");
        } else {
            System.out.println("Submission rejected: Bob has already submitted.");
        }
        if (submissions.add("Charlie")) {
            System.out.println("Charlie submitted successfully.");
        } else {
            System.out.println("Submission rejected: Charlie has already submitted.");
        }
        if (submissions.add("Anna")) {
            System.out.println("Anna submitted successfully.");
        } else {
            System.out.println("Submission rejected: Anna has already submitted.");
        }
        if (submissions.add("David")) {
            System.out.println("David submitted successfully.");
        } else {
            System.out.println("Submission rejected: David has already submitted.");
        }
        if (submissions.add("Eva")) {
            System.out.println("Eva submitted successfully.");
        } else {
            System.out.println("Submission rejected: Eva has already submitted.");
        }
        if (submissions.add("Bob")) {
            System.out.println("Bob submitted successfully.");
        } else {
            System.out.println("Submission rejected: Bob has already submitted.");
        }
        if (submissions.add("Fiona")) {
            System.out.println("Fiona submitted successfully.");
        } else {
            System.out.println("Submission rejected: Fiona has already submitted.");
        }
        System.out.println("Students who submitted:");
        System.out.println(submissions);
    }
}
