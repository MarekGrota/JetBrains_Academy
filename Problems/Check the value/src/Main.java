import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isLess(number));

    }
    public static boolean isLess(int num) {
        return  num < 10;
    }
}