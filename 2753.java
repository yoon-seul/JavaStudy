import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        int num1 = year % 4;
        int num2 = year % 100;
        int num3 = year % 400;

        if (num1 == 0){
            if (num2 != 0 || num3 == 0) {
                System.out.printf("%d", 1);
            }
            else {
                System.out.printf("%d", 0);
            }
        }
        else {
            System.out.printf("%d", 0);
        }

        scan.close();
    }
}
