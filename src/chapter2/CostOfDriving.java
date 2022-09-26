package chapter2;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        // average cost per mile of driving a car is $0.58
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double driving_distance  = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles_per_gallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price_per_gallon = input.nextDouble();

        // 900.5 25.5 3.55 -- 125.36
        // distance divided by the miles per gallons multiplies by
        // the price per gallon

        double amount_of_gallons_needed = driving_distance / miles_per_gallon;
        double price = amount_of_gallons_needed * price_per_gallon;
        System.out.printf("The cost of driving is $ %.2f", price);
    }
}
