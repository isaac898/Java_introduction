package chapter3;
import java.util.ArrayList;
import java.util.Scanner;

public class ISBN10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int output = 0;
        System.out.print("Enter the first 9 digits of an ISB as integer: ");

        String intake = input.nextLine();
        String[] split = intake.split("");
//        for (int i =0; i<split.length; i++) {
//            System.out.println(split[i]); // splits the string into an array
//
//        }

        ArrayList<Integer> numbers = new ArrayList<>(); //
        for (String s : split) {
            numbers.add(Integer.parseInt(s));
        }
//        for(int i = 0; i < split.length; i++) {
//            numbers.add(Integer.parseInt(split[i]));
//        }
        // the above code without the comment is the same as the above code with the comments

        int output = (numbers.get(0) ) + (numbers.get(1) * 2 ) + (numbers.get(2) * 3 ) + (numbers.get(3) * 4 ) + (numbers.get(4) * 5 ) + (numbers.get(5) * 6 ) + (numbers.get(6) * 7 ) + (numbers.get(7) * 8 ) + (numbers.get(8) * 9 ) ;
        int actual_output = output % 11;
        numbers.add(actual_output);
        StringBuilder sb = new StringBuilder();
//        for (int i = arrList.size() - 1; i>=0; i--){} ; // for reverse order
        for (int i = 0; i < numbers.size(); i++){
            int num = numbers.get(i);
            sb.append(num);
        }
        String result = sb.toString();
        System.out.println(result);

    }
}
