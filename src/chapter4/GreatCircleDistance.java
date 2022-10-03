package chapter4;

import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double latitude_one = input.nextDouble();
        System.out.print("fill");
        double longitude_one = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double latitude_two = input.nextDouble();
        System.out.print("fill");
        double longitude_two = input.nextDouble();

        double RADIUS = 6371.01 ;

        // convert to radians
        latitude_one = Math.toRadians(latitude_one);
        longitude_one = Math.toRadians(longitude_one);

        latitude_two = Math.toRadians(latitude_two);
        longitude_two = Math.toRadians(longitude_two);

        double d = RADIUS * Math.atan( Math.sin(latitude_one) * Math.sin(latitude_two) + Math.cos(latitude_one) * Math.cos(latitude_two) * Math.cos(longitude_one - longitude_two) ) ;
        System.out.println("The distance between the two points is " + d);

    }
}
