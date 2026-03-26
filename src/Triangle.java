/**
 * The Triangle class prints the perimeter and area of a triangle
 *
 * @version 1
 */
import java.util.Scanner;

public class Triangle {
    /**
     * Gets the length of the 3 sides of a triangle from the user,
     * checks their legality,
     * in case of illegal lengths - prints appropriate notice.
     * otherwise - calculates the perimeter and area of the triangle
     */
    public static void main(String[] args) {
        // Gets the lengths of the triangle sides from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the area " +
                "and the perimeter of a given triangle. ");
        System.out.println("Please enter the three lengths" +
                " of the triangle's sides");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("The lengths of the triangle sides are: " + a + ", " + b + ", " + c);

        // Check that the sides are natural numbers
        if (a <= 0 || b <= 0 || c <= 0)
            System.out.println("The length of each side must be a natural number!");
        else {
            int perimeter = a + b + c;
            double s = perimeter / 2.0;

            // Check the sides can represent a triangle
            if (s - a <= 0 || s - b <= 0 || s - c <= 0)
                System.out.println("The given three sides don't represent a triangle");
            else {
                // Calculation of the area
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                // Output
                System.out.println("The perimeter of the triangle is: " + perimeter);
                System.out.println("The area of the triangle is: " + area);
            }
        }
    }
}