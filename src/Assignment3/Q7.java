/*
Write a java program that takes the x – y coordinates of a point in the Cartesian plane and
prints a message telling either an axis on which the point lies or the quadrant in which it is found.
Sample lines of output:
(-1.0, -2.5) is in quadrant III
(0.0, 4.8) is on the y-axis
 */

package Assignment3;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the X-Coordinate of the point: ");
        double x=sc.nextDouble();
        System.out.println("Enter the Y-Coordinate of the point: ");
        double y=sc.nextDouble();
        if(x==0) {
            System.out.println("(" + x + "," + y + ") is on the y-axis");
        }
        else if(y==0) {
            System.out.println("(" + x + "," + y + ") is on the x-axis");
        }
        else if(x>0 && y>0)
            System.out.println("("+x+","+y+") is on the first quadrant");
        else if(x<0 && y>0)
            System.out.println("("+x+","+y+") is on the second quadrant");
        else if(x<0 && y<0)
            System.out.println("("+x+","+y+") is on the third quadrant");
        else if(x<0 && y>0)
            System.out.println("("+x+","+y+") is on the fourth quadrant");
        else if(x==0 && y==0)
            System.out.println("("+x+","+y+") is at center");
        sc.close();

    }
}
