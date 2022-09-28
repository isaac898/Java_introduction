package chapter1;

import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args) {
        double a;
        double b;
//        double x;
//        double y;
        double c;
        double d;
        double e;
        double f;
//        double X;
//        double Y;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for a: ");
        a = input.nextDouble();
        System.out.println("Enter a value for b: ");
        b = input.nextDouble();
        System.out.println("Enter a value for c: ");
        c = input.nextDouble();
        System.out.println("Enter a value for d: ");
        d = input.nextDouble();
        System.out.println("Enter a value for e: ");
        e = input.nextDouble();
        System.out.println("Enter a value for f: ");
        f = input.nextDouble();

        double x = ( e*d - b*f ) / ( a*d - b*c ) ;

    }
}
