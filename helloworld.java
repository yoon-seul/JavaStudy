import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String result;
        
        if (num1>num2){
            result = ">";
        } else if (num1<num2) {
            result = "<";
        } else {
            result = "==";
        }
        
        System.out.println(result);
    }
}