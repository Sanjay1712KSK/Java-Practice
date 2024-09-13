import java.util.Arrays;
import java.util.Collections;
public class statica {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {50,10, 25, 80, 45};

        // Assume the first element is the largest
        int max = numbers[0];

        // Loop through the array to find the greatest number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < max) {
                max = numbers[i];
            }
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("The greatest number is: " + max);
        for(int i=0;i< numbers.length;i++){
                int temp=numbers[i] ;
                numbers[i]=numbers[numbers.length-i-1];
                numbers[numbers.length-i-1]=temp;
        }
        for(int i=0;i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
