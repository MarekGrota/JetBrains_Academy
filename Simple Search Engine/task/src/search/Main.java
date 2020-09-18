package search;

import java.util.Scanner;

public class Main {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of people:");
        String[] database = new String[Integer.parseInt(scanner.nextLine())];
        getPeople(database);

        boolean loop = false;
        while (!loop) {
            printMenu();
            switch (scanner.nextLine()) {
                case "1": {
                    System.out.println("Enter a name or email to search all suitable people.");
                    String toSearch = scanner.next().toLowerCase();
                    find(database, toSearch);
                    System.out.println();
                    break;
                }
                case "2": {
                    printAllPeople(database);
                    break;
                }
                case "0":
                    loop = true;
                    System.out.println("\nBye!");
                    break;
                default:
                    System.out.println("Incorrect option! Try again.");
            }
        }
    }

    public static void getPeople(String[] db) {
        System.out.println("Enter all people:");
        for (int i = 0; i < db.length; i++) {
            db[i] = scanner.nextLine();
        }
    }

    private static void printMenu() {
        System.out.print("\n=== Menu ===\n1. Find a person\n2. Print all people\n0. Exit\n");
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

    private static void printAllPeople(String[] inputs) {
        System.out.println("\n=== List of people ===");
        for (String input : inputs) {
            System.out.println(input);
        }
    }
}

