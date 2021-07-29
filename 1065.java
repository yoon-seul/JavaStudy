import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int count=0;

        for (int i=1;i<input+1;i++){
            if (hansu(i)==true)
                count++;
        }
        
        System.out.println(count);

        scan.close();
    }

    public static boolean hansu(int x){

        int[] num = new int[4];
        
        if (x<100) {
            return true;
        } else if(x==1000) {
            return false;
        }else {    
            for (int i=0;i<4;i++){
               num[i]=x%10;
                x /= 10;
             if (x==0)
                  break;
           }

          float average = (float)(num[0]+num[2])/(float)2;

            if (average==(float)num[1])
                return true;


        }
    
        return false;
    }
}