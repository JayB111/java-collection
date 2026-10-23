package se.lexicon;
import java.util.LinkedList;
import java.util.Queue;

public class ConcertQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Anna");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");
        queue.add("Eva");
        queue.add("Fiona");
        System.out.println("Letting in: " + queue.remove());
        System.out.println("Letting in: " + queue.remove());
        System.out.println("Remaining queue: " + queue);
    }
}
