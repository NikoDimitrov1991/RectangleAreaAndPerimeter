import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the rectangle length:  ");
        double L = sc.nextDouble();

        System.out.println("Please enter the rectangle width:  ");
        double W = sc.nextDouble();

        Rectangle rectangle = new Rectangle(L,W);

        double rectanglePerim = rectangle.findPerim();
        System.out.println("The rectangle perimeter is:  " + rectanglePerim);

        double  rectangleArea = rectangle.findArea();
        System.out.println("The rectangle area is:  " + rectangleArea);
    }
}
