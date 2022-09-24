package chapter2;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        // read the integer
        Scanner input = new Scanner(System.in);
        //System.out.println("please enter your number between 0 - 1000: ");
        int the_number = -1;
        int sum = 0;
        while( !(the_number > 0 && the_number <= 1000)) { // input validation
            System.out.println("enter a number between 1 - 1000: ");
            the_number = input.nextInt();

        }
        // modulus by ten, add to the sum, divide by 10, repeat
        while (the_number != 0 ) {
            int digit = the_number % 10 ;
            sum += digit;
            the_number = the_number / 10;
        }
        System.out.println(sum);
        //System.out.println(sum);


    }
}
