//BaekJoon #10430 by yoonseul at 210730

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numA = scan.nextInt();
        int numB = scan.nextInt();
        int numC = scan.nextInt();

        int resultA = (numA+numB)%numC;
        int resultB = ((numA%numC)+(numB%numC))%numC;
        int resultC = (numA*numB)%numC;
        int resultD = ((numA%numC)*(numB%numC))%numC;

        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);
        System.out.println(resultD);

        scan.close();
    }
}
