import java.util.Scanner;

public class Mai{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int[] input = new int[10];
        
        int result =0;

        for (int i = 0 ; i<10 ; i++ ){
            input[i]=scan.nextInt();
            input[i] = input[i] % 42;
        }

        for (int i=0;i<10;i++){
            int count = 0;
            for (int j=i+1;j<10;j++){
                if (input[i]==input[j]){ //한개만 있는 것을 센다
                    count++;
                }    
            }
            if (count==0){
                result++;
            }
     
        }
        System.out.printf("%d",result);
    }
}