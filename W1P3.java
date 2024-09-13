import java.util.Scanner;

public class W1P3 {

  public static void main(String[] args)

  {
    int i, n, sum = 0;
      Scanner in = new Scanner(System.in);
      // System.out.print("Input number: ");
      n = in.nextInt();
    System.out.printf("The first %d natural numbers are : \n",n);
    // Use loop to display n natural numbers
for(i=1;i<=n;i++){
	System.out.println(i);
    sum+=i;
}
//sum the natural numbers up to n.

  System.out.printf("The Sum of Natural Number upto %d terms : %d",n,sum);
  }
}
