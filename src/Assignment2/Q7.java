/*
Write a java program that prompts the user to enter the side of a hexagon and displays its area.
The formula for computing the area of a hexagon is
𝐴𝑟𝑒𝑎=3√32𝑥2
where s is the length of a side.
Here is a sample run:
Enter the side: 5.5
The area of the hexagon is 78.5895
 */

package Assignment2;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double side,area;
        System.out.print("Enter the side: ");
        side=sc.nextDouble();
        area=(3*Math.pow(3,0.5)/2)*side*side;
        System.out.println("The area of the hexagon is "+area);
    }
}
