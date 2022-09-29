package chapter3;

import java.net.ConnectException;
import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in the first edge: ");
        double first_edge = input.nextDouble();
        System.out.print("Enter in the second edge: ");
        double second_edge = input.nextDouble();
        System.out.print("Enter in the second edge: ");
        double third_edge = input.nextDouble();

        boolean first_condition =  first_edge + second_edge > third_edge ;
        boolean second_condition = first_edge + third_edge > second_edge;
        boolean third_condition = second_edge + third_edge > first_edge;
        if (first_condition && second_condition && third_condition){
            double output = first_edge + second_edge + third_edge;
            System.out.println(output);
        } else {
            System.out.println("The input is invalid");
        }

    }
}
