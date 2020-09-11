import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] countOccurrences(int[] first, int[] second) {
        int[] third = new int[first.length];
        for (int i = 0; i < first.length; i++) {
            int count = 0;
            for (int j : second) {
                if (first[i] == j) {
                    count++;
                }
            }
            third[i] = count;
        }
        return third;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final String result = Arrays.toString(countOccurrences(first, second))
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);
    }
}