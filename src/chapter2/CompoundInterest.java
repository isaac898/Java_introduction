package chapter2;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double MONTHLY_INTEREST_RATE = 0.00417;
        double savings=0;
        double savings_added = 0;
        System.out.print("Enter the monthly saving amount: ");
        double saving_amount = input.nextDouble();

        for (int i = 0; i < 6; i++){ // runs six times
            savings = (100 + savings_added) * (1 + MONTHLY_INTEREST_RATE);
            savings_added = savings;
        }
        System.out.printf("$%.2f", savings);
    }
}
