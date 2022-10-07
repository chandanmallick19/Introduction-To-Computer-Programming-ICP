/* Write a program that reads in the radius and length of a cylinder and computes the area
and volume using the following formulas:
area = radius * radius * pi
volume = area * length */

package Assignment2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder in cm: ");
        double radius=sc.nextDouble();
        System.out.print("Enter the length of the cylinder un cm: ");
        double length=sc.nextDouble();
        double area=radius*radius*3.14;
        double volume=area*length;
        System.out.print("The area of the cylinder is "+area+" and the volume if  the cylinder is "+volume);
    }
}
