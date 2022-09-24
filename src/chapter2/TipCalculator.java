package chapter2;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please input your subtotal : " );
        double subTotal = input.nextDouble();
        System.out.print("please input your gratuity rate: " );
        double gratuityRate = input.nextDouble() / 100;

        double gratuity = gratuityRate * subTotal ;
        double total = gratuity + subTotal;

        String string_gratuity = String.format("%.2f", gratuity);
        String string_total = String.format("%.2f", total);
//        System.out.printf("the gratuity is $%.2f and the total is $%.2f  ", gratuity, total);
        System.out.println("the gratuity is $" + string_gratuity + " and the total is $" + string_total);
    }
}
