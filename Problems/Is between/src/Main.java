import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(isInclusive(num1, num2, num3));
    }

    public static boolean isInclusive(int a, int b, int c) {
        return a >= b && a <= c || a >= c && a <= b;
    }
}