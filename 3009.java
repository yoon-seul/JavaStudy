import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        float[] x = new float[3];
        float[] y = new float[3];

        int resultX, resultY;
        float X,Y;
        float midX=0,midY=0;

        for (int i=0;i<3;i++){
            x[i]=scan.nextInt();
            y[i]=scan.nextInt();
        }

        for (int i=1;i<3;i++){
            if(x[0] != x[i]){
                midX=(x[0]+x[i])/2;
            }
        }
        X=4*midX-x[0]-x[1]-x[2];
        resultX = (int) X;

        for (int i=1;i<3; i++){
            if(y[0] != y[i]){
                midY=(y[0]+y[i])/2;
            }
        }
        Y=4*midY-y[0]-y[1]-y[2];
        resultY = (int) Y;

        System.out.printf("%d %d",resultX, resultY);
    }


}
