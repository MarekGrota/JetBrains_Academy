import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        isPositive(num);
    }

    public static void isPositive(int number) {
        if (number > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}