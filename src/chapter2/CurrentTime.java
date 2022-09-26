package chapter2;
import java.util.*;
import java.text.*;
import java.io.*;
public class CurrentTime {
    public static void main(String[] args) {
        //GMT is 7 hours ahead of pacific time
//        Scanner input = new Scanner(System.in);

        // data inputted
        System.out.print("Enter the time zone offset to GMT: ");
        Scanner input = new Scanner(System.in);
        int GMT_INPUT = input.nextInt();

        //GMT format
//        DateFormat gmtFormat = new SimpleDateFormat();
//        TimeZone gmtTime = TimeZone.getTimeZone("GMT");
//        gmtFormat.setTimeZone(gmtTime);
//        System.out.println("GMT Time: " + gmtFormat.format(GMT_INPUT));
        //pst format
        DateFormat pstFormat = new SimpleDateFormat();
        TimeZone pstTime = TimeZone.getTimeZone("PST");
        pstFormat.setTimeZone(pstTime);
        System.out.println("PST Time: " + pstFormat.format(GMT_INPUT));
    }
}
