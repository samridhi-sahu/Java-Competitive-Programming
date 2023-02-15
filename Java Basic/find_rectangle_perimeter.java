// java program to find perimeter of rectangle

import java.util.Scanner;

public class find_rectangle_perimeter {
    public static void main(String[] args) {
        float side1, side2, perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of rectangle : ");
        side1 = sc.nextFloat();
        side2 = sc.nextFloat();
        // we know that perimeter of rectangle is two times of the sum of both sides
        perimeter = 2 * (side1 + side2);
        System.out.println("Perimeter of Rectangle is : " + perimeter);

    }
}