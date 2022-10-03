package chapter4;
import java.util.*;

public class OrderCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] arr = new String[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the city one, two, or three: ");
            arr[i] = input.nextLine();
        }

        for (int m = 0; m < arr.length; m++){
            for(int j = m + 1; j < arr.length; ++j ) {
                if (arr[m].compareTo(arr[j]) > 0) {
                    String temp = arr[m];
                    arr[m] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println("The three cities in alphabetical order are " + arr[0] + ", " + arr[1] + ", " + arr[2]);

    }
}
