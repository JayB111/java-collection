package se.lexicon;
public class LargestNumber {

    public static void main(String[] args) {
        int[] numbers = {14, 3, 78, 45, 22, 91, 7, 56};
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}