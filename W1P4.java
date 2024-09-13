import java.util.Scanner;
public class W1P4 {
  public static void main(String[] args) {
      int i, j, n, k = 1;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      for(i=1;i<=n;i++){
  for(j=1;j<=i;j++){
    System.out.print(k+" ");
    k++;
  }
  System.out.print("\n");
      }
  }}