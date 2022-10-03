package chapter4;

import java.util.Scanner;

public class ASCIICode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();
        System.out.println("The character for the ASCII code " + code + " is " + (char)code );
    }
}
