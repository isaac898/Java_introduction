package chapter1;

public class RectangleProperties {
    public static void main(String[] args) {
        // perimeter equal 2(length + width)
        // area = width * height
        // width = 4.5
        // height = 7.9
        double WIDTH = 4.5 ;
        double HEIGHT = 7.9 ;

        double area = WIDTH * HEIGHT;
        double perimeter = 2 * (WIDTH + HEIGHT);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
