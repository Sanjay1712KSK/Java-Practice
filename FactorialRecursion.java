import java.util.Scanner;
public class FactorialRecursion {
        static int factorial(int n){
            if(n==0){
                return 1;
            }
            else{
                return n*factorial(n-1);
            }
        }
public static void main(String[] args){
    Scanner a=new Scanner(System.in);
    int n=a.nextInt();
    System.out.println("The factorial of "+n+" is "+FactorialRecursion.factorial(n));
}}