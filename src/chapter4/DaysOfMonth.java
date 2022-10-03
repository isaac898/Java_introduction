package chapter4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) throws ParseException {
        // gets the year and the month
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month ");
        String month = input.next();
// converts the month to designated number
        SimpleDateFormat inputFormat = new SimpleDateFormat("MMMM");
        Calendar cal = Calendar.getInstance();
        cal.setTime(inputFormat.parse(month));
        SimpleDateFormat outputFormat = new SimpleDateFormat("MM"); // 01-12
        int the_number = Integer.parseInt(outputFormat.format(cal.getTime()));

// outputs the number of days in the month in the year
        YearMonth yearMonthObject = YearMonth.of(year, the_number);
        int day_in_month = yearMonthObject.lengthOfMonth();
        System.out.println(month + " " + year + " has " + day_in_month + " days");

    }
}
