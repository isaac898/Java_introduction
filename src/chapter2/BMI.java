package chapter2;

import java.util.Scanner;
import static java.lang.Math.*;
public class BMI {
    public static void main(String[] args) {
        // weight ( kg ) / sqrt( height(m) )
        Scanner input = new Scanner(System.in);
        double pound_to_kilo = 0.45359237;
        double inches_to_meter = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weight_in_pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height_in_inches = input.nextDouble();

        double weight_in_kilo = weight_in_pounds * pound_to_kilo;
        double height_in_meters = height_in_inches * inches_to_meter;

        double BMI = (weight_in_kilo)  / (sqrt(height_in_meters));

        System.out.println("BMI is " + BMI);
    }
}
