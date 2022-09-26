package chapter2;
import java.util.Scanner;

public class AverageAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0 : ");
        double initial_velocity = input.nextDouble();
        System.out.print("Enter v1: ");
        double final_velocity = input.nextDouble();
        System.out.print("Enter time span t in seconds: ");
        double time_span_in_seconds = input.nextDouble();

        double acceleration = (final_velocity - initial_velocity) / time_span_in_seconds;
        System.out.println("The average acceleration is " + acceleration);
    }
}
