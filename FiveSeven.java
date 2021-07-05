public class FiveSeven{
    public static void main(String[] args){
        int i = 0;
        for ( i = 0 ; i < 100 ; i++){
            if (i%5==0 || i%7==0){
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}