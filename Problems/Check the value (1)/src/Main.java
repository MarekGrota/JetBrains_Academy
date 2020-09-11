import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isCorrect(num));
    }

    public static boolean isCorrect(int number) {
        return number > 0 && number < 10;
    }
}