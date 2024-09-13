import java.util.Scanner;
public class W1P5 {
    public static void main(String args[]){
//            // Declare variables to store decimal number, quotient, and an array for binary
//        // digits
//        int dec_num, quot, i = 1, j;
//        int bin_num[] = new int[100];
//        // Create a Scanner object to read input from the user
//        Scanner scan = new Scanner(System.in);
//        // Prompt the user to input a decimal number
//        // System.out.print("Input a Decimal Number: ");
//        dec_num = scan.nextInt();
//        // Initialize the quotient with the decimal number
//        quot = dec_num;
//        // Convert the decimal number to binary and store binary digits
//
//        // Display the binary representation of the decimal number
//        System.out.print("Binary number is: ");
//        for (j = i - 1; j > 0; j--) {
//            System.out.print(bin_num[j]);
//        }
//        //System.out.print("\n");
//    }
//}
        String str1 = "NPTEL";

    String str2 = "java";

    int a = 20;

    int b = 24;

    System.out.println(str1 + a + b); // Statement 1



    System.out.println(a + b + str2); // Statement 2

   int f = 0, g = 1;

    for (int i = 0; i <= 5; i++) {

      System.out.println(f);

      f = f + g;

      g = f - g;

    }
    int x = 5;

    x *= (2 + 8);

    System.out.println(x);
    }
}
