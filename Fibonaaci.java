import java.util.Scanner;

public class Fibonaaci {
    static int fibonac(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        else{
            return fibonac(n-1)+fibonac(n-2);
        }
    }
    public static void main(String[] args){
        //Fibonaaci ff=new Fibonaaci();
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        for(int i=0;i<n;i++){
        System.out.println(fibonac(i));
    }}
}
