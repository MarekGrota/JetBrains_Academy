import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("0")) {
            String x = scanner.next();
            try {
                System.out.println(Integer.parseInt(x) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + x);
            }
        }
    }
}