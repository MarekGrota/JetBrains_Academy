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

        System.out.println("Enter the number of search queries:");
        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            System.out.println("Enter data to search people:");
            String toSearch = scanner.next().toLowerCase();
            find(database, toSearch);
            System.out.println();
        }
    }


    static void find(String[] strings, String toSearch) {
        boolean check = false;
        for (String string : strings) {
            if (string.contains(toSearch)) {
                System.out.println(string);
                check = true;
            }
        }
        if (!check)
            System.out.println("No matching people found.");
    }
}

