import java.util.Scanner;

public class Mai{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String input= scan.nextLine();

        char[] inputArr = new char[input.length()];

        for(int i=0;i<input.length();i++){
            inputArr[i]=input.charAt(i);
        }
        
        int count=0;

        for (int i=0;i<input.length();i++){
            if (inputArr[i] == ' ') {
                count++;
            }
        }

        if (inputArr[0]== ' '){
            count--;
        }
        if (inputArr[input.length()-1]==' '){
            count--;
        }
        count++;

        System.out.println(count);
    }
}
