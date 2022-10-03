package chapter3;

import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        double x_coord = input.nextDouble();
        System.out.print("Enter the y coordinate ");
        double y_coord = input.nextDouble();
        if ( (x_coord <= 5 ) && ( y_coord <= 2.5 ) ){
            System.out.println("Point ("+x_coord+", "+y_coord+") is in the rectangle");
        } else {
            System.out.println("Point ("+x_coord+", "+y_coord+") is not in the rectangle");
        }

    }
}
