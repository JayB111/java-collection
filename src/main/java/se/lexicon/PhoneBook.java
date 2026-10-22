package se.lexicon;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Anna", "0701111111");
        phoneBook.put("Bob", "0702222222");
        phoneBook.put("Alice", "0703333333");
        phoneBook.put("Charlie", "0704444444");phoneBook.put("Anna", "0701111111");
        phoneBook.put("Bob", "0702222222");
        phoneBook.put("Alice", "0703333333");
        phoneBook.put("Charlie", "0704444444");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to look up: ");
        String name = scanner.nextLine();
        String phoneNumber = phoneBook.get(name);
        if (phoneNumber != null) {
            System.out.println("Phone number: " + phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }
}