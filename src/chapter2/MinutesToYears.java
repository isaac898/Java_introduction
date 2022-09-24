package chapter2;

import java.util.Scanner;

public class MinutesToYears {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter in the amount of minutes: ");
        int minutes = input.nextInt();
        final int MINUTES_PER_YEAR = 525600;  // final means it will never change
        final int MINUTES_PER_DAY = 1440; // final means it will never change
        int years = minutes / MINUTES_PER_YEAR; // converts minutes to years
        minutes -= MINUTES_PER_YEAR * years;
        int days = minutes / MINUTES_PER_DAY;

        System.out.println(years);
        System.out.println(days);


    }

}