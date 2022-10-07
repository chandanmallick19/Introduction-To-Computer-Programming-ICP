/* Average acceleration is defined as the change of velocity divided by the time taken to make the change,
as shown in the following formula:
𝑎=𝑣1−𝑣0𝑡
Write a java program that prompts the user to enter the starting velocity v0 in meters/second,
the ending velocity v1 in meters/second, and the time span t in seconds, and displays the average acceleration.
Here is a sample run:
Enter v0, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.0889
 */

package Assignment2;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double v0,v1,t;
        System.out.print("Enter the v0,v1 and t respectively: ");
       v0=sc.nextDouble();
       v1=sc.nextDouble();
       t=sc.nextDouble();
       double acceleration=(v1-v0)/t;
        System.out.println("The average acceleration is "+acceleration);
    }
}
