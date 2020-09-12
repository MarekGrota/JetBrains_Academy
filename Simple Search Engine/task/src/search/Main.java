package search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();
        String[] database = new String[numberOfPeople];
        System.out.println("Enter all people:");
        for (int i = 0; i < numberOfPeople; i++) {
            database[i] = scanner.nextLine();
        }
        boolean loop = false;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Find a person");
            System.out.println("2. Print all people");
            System.out.println("0. Exit");
            int decision = scanner.nextInt();
            switch (decision) {
                case 1: {
                    System.out.println("Enter a name or email to search all suitable people.");
                    String toSearch = scanner.next().toLowerCase();
                    find(database, toSearch);
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("=== List of people ===");
                    for (int i = 0; i < numberOfPeople; i++) {
                        System.out.println(database[i]);
                    }
                    break;
                }
                case 0:
                    loop = true;
                    System.out.println("\nBye!");
                    break;
                default:
                    System.out.println("Incorrect option! Try again.");
            }
        } while (!loop);
    }

    static void find(String[] strings, String toSearch) {
        boolean check = false;
        for (String string : strings) {
            if (string.toLowerCase().contains(toSearch)) {
                System.out.println(string);
                check = true;
            }
        }
        if (!check)
            System.out.println("No matching people found.");
    }
}

