import java.util.Scanner;
public class nptelassignemnts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.print("The sum of the digits is: " + sumDigits(n));
    }
    // Calculate the sum of the digits by defining a sumDigits() function
public static int sumDigits(long n){
	int sum=0;
  while (n!=0){
    long ld=n%10;
    sum+=ld;
    n/=10;
  }
// This should return the sum
  return sum;
}}