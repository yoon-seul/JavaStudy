//BaekJoon #2577 by yoonseul at 210801

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int numA = scan.nextInt();
        int numB = scan.nextInt();
        int numC = scan.nextInt();

        long[] num = new long[10];
        int[] fResult = new int[10];

        for (int i=0;i<10;i++){
            num[i]=10;
        }

        long result = numA * numB * numC;

        for (int i=0;i<10;i++){
            num[i]= result % 10;
            if ((result/10)==0)
                break;
            result /= 10;
        }


        for (int i=0;i<10;i++){
            int count=0;
            for (int j=0;j<10;j++){
                if (i==num[j])
                    count++;
            }
            fResult[i]=count;
        }

        for (int i=0;i<10;i++){
            System.out.println(fResult[i]);
        }
        
        scan.close();
    }
}