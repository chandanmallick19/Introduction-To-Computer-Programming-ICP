/*
Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays
the number of years and days for the minutes.
For simplicity, assume a year has 365 days.
Here is a sample run:
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
 */

package Assignment2;
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long minutes,years,days;
        System.out.print("Enter the number in minutes: ");
        minutes=in.nextLong();
        years=minutes/(365*24*60);
        days=(minutes%(365*24*60))/(24*60);
        System.out.println(minutes+" minutes is approaximately "+years+" years and "+days+" days");
    }
}
