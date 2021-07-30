import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[2];
        int input = scan.nextInt();
        int newInput=100;
        int count=0;

        num[0]=input/10;
        num[1]=input%10;

        while (input != newInput) {
            count++;
            int newNum=num[0]+num[1];
            if (newNum>9){
                newNum = newNum % 10;
            }
            newInput = num[1]*10+newNum;
            if (input == newInput)
                break;
            num[0]=num[1];
            num[1]=newNum;
        }
        
        System.out.printf("%d", count);

        scan.close();
    }
}
