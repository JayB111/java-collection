package se.lexicon;

import java.util.Arrays;
import java.util.List;
public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                34, 78, 23, 78, 91, 56, 91, 12
        );
        int largest = numbers.get(0);
        int secondLargest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number < largest && number > secondLargest) {
                secondLargest = number;
            }
        }
        System.out.println("Second largest unique value: " + secondLargest);
    }
}
