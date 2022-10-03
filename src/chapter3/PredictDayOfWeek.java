package chapter3;

import java.util.Scanner;

public class PredictDayOfWeek {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter the year(i.e. 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        if (month == 1){
            month = 13 ;
        }
        if (month == 2 ){
            month = 14;
        }
        System.out.print("Enter the day of the week: 1-31: ");
        int day_of_the_month = input.nextInt();

        // divide the year by 100, drop the decimal and add one
        int century =  year / 100  ;
        int year_of_the_century = year % 100;

        int day_of_the_week = ( ( day_of_the_month ) + ( ( 26*(month + 1) ) / 10 ) + ( year_of_the_century ) + ( year_of_the_century / 4 ) + ( century / 4 ) + ( 5 * century ) ) % 7;

        if(day_of_the_week == 0){
            System.out.println("Day of the week is: Saturday") ;
        }
        if(day_of_the_week == 1){
            System.out.println("Day of the week is: Sunday") ;
        }
        if(day_of_the_week == 2){
            System.out.println("Day of the week is: Monday");
        }
        if(day_of_the_week == 3){
            System.out.println("Day of the week is: Tuesday") ;
        }
        if(day_of_the_week == 4){
            System.out.println("Day of the week is: Wednesday") ;
        }
        if(day_of_the_week == 5){
            System.out.println("Day of the week is: Thursday") ;
        }
        if(day_of_the_week == 6){
            System.out.println("Day of the week is: Friday") ;
        }


    }

}
