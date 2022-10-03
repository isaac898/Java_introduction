package chapter4;

import java.util.Scanner;

public class RegularPolyonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double number_of_sides = input.nextDouble();
        System.out.print("Enter the side: ");
        double side_length = input.nextDouble();

        double area = (number_of_sides * (side_length * side_length) ) / (4 * Math.tan(3.14 / 4) ) ;
        System.out.println(area);
    }
}
