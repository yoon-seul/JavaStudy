//BaekJoon #10871 by yoonseul at 210726

import java.util.Scanner;

public class Mai {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int standard = scan.nextInt();

        int[] number = new int[10000];

        for (int i=0;i<num;i++){
            number[i]=scan.nextInt();
        }

        for (int i=0;i<num;i++){
            if (number[i]<standard)
                System.out.printf("%d ", number[i]);
        }
        scan.close();
    }
}
