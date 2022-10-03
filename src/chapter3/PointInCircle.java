package chapter3;

import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        int x_coord = input.nextInt() ;
        System.out.print("Enter the y coordinate: ");
        int y_coord = input.nextInt();

        // calculate the distance
        double formula = ( x_coord * x_coord ) + ( y_coord * y_coord) ;
        double distance = Math.sqrt(formula);
        if (distance <= 10) {
            System.out.println("Point (" + x_coord + ", " + y_coord + ") is in the circle ");
        } else {
            System.out.println("Point (" + x_coord + ", " + y_coord + ") is not in the circle ");
        }

    }
}
