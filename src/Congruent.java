/**
 * The Congruent prints whether 2 triangles are congruent or not.
 *
 * @version 1
 */

import java.util.Scanner;

public class Congruent {
    /**
     *  Gets six vertices representing two triangles,
     *  calculates the length of each side of the triangles,
     *  checks if the two triangles are congruent.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Gets the vertices of the first triangle from the user
        System.out.println("Please enter the coordinates of the 3 " +
                "vertices of the first triangle:");
        System.out.println("Enter the first vertex (2 real numbers)");
        double x11 = scan.nextDouble();
        double y11 = scan.nextDouble();

        System.out.println("Enter the second vertex (2 real numbers)");
        double x12 = scan.nextDouble();
        double y12 = scan.nextDouble();

        System.out.println("Enter the third vertex (2 real numbers)");
        double x13 = scan.nextDouble();
        double y13 = scan.nextDouble();

        // Gets the vertices of the second triangle from the user
        System.out.println("Please enter the coordinates of the 3 " +
                "vertices of the second triangle:");
        System.out.println("Enter the first vertex (2 real numbers)");
        double x21 = scan.nextDouble();
        double y21 = scan.nextDouble();

        System.out.println("Enter the second vertex (2 real numbers)");
        double x22 = scan.nextDouble();
        double y22 = scan.nextDouble();

        System.out.println("Enter the third vertex (2 real numbers)");
        double x23 = scan.nextDouble();
        double y23 = scan.nextDouble();

        // Calculates the length of the sides of each triangle
        double side11 = Math.sqrt(Math.pow(x11 - x12, 2) + Math.pow(y11 - y12, 2));
        double side12 = Math.sqrt(Math.pow(x12 - x13, 2) + Math.pow(y12 - y13, 2));
        double side13 = Math.sqrt(Math.pow(x13 - x11, 2) + Math.pow(y13 - y11, 2));
        double side21 = Math.sqrt(Math.pow(x21 - x22, 2) + Math.pow(y21 - y22, 2));
        double side22 = Math.sqrt(Math.pow(x22 - x23, 2) + Math.pow(y22 - y23, 2));
        double side23 = Math.sqrt(Math.pow(x23 - x21, 2) + Math.pow(y23 - y21, 2));

        System.out.println("The first triangle is (" + x11 + ", " + y11 + ") (" + x12 + ", " + y12 + ") (" + x13 + ", " + y13 + ").");
        System.out.println("Its lengths are " + side11 + ", " + side12 + ", " + side13 + ".");
        System.out.println("The second triangle is (" + x21 + ", " + y21 + ") (" + x22 + ", " + y22 + ") (" + x23 + ", " + y23 + ").");
        System.out.println("Its lengths are " + side21 + ", " + side22 + ", " + side23 + ".");

        // Checks if the two triangles are congruent
        if ((side11 == side21 && side12 == side22 && side13 == side23) ||
                (side11 == side21 && side12 == side23 && side13 == side22) ||
                (side11 == side22 && side12 == side23 && side13 == side21) ||
                (side11 == side22 && side12 == side21 && side13 == side23) ||
                (side11 == side23 && side12 == side21 && side13 == side22) ||
                (side11 == side23 && side12 == side22 && side13 == side21))
            System.out.println("The triangles are congruent.");
        else
            System.out.println("The triangles are not congruent.");
    }
}