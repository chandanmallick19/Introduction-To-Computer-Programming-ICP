/* Write a program that reads a number in feet, converts it to meters, and displays the result.
One foot is 0.305 meter */

package Assignment2;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length in feet :");
        double feet=sc.nextDouble();
        double meter=feet*0.305;
        System.out.print(feet+" feet is "+meter+" meter.");
    }
}
