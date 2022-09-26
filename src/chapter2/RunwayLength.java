package chapter2;

import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pleas enter in the speed: ");
        double speed = input.nextDouble();
        System.out.print("Please enter in the acceleration: ");
        double acceleration = input.nextDouble();

        double length = (speed * speed ) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is: " + length);
    }
}
