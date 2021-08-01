import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int result = num * (num + 1) / 2;

        System.out.println(result);
    }
}
