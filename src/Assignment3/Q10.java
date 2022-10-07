/*
Write a Java program that prompts user to enter an integer for today's day of the week
(Sunday is 0, Monday is 1... and Saturday is 6). Also prompt user to enter the number of days
after today for a future day and display the future day of the week.
 */

package Assignment3;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for today's date: ");
        int date=sc.nextInt();
        System.out.println("Enter the number of days elapsed till today: ");
        int day_elapsed=sc.nextInt();
        int future_day=(date+day_elapsed)%7;
        System.out.println("Today is: ");
        switch(date){
            case 0:
                System.out.println("SUNDAY");break;
            case 1:
                System.out.println("MONDAY");break;
            case 2:
                System.out.println("TUESDAY");break;
            case 3:
                System.out.println("WEDNESDAY");break;
            case 4:
                System.out.println("THURSDAY");break;
            case 5:
                System.out.println("FRIDAY");break;
            case 6:
                System.out.println("SATURDAY");
        }
        System.out.print("and the future day is: ");
        switch(future_day){
            case 0:
                System.out.println("SUNDAY");break;
            case 1:
                System.out.println("MONDAY");break;
            case 2:
                System.out.println("TUESDAY");break;
            case 3:
                System.out.println("WEDNESDAY");break;
            case 4:
                System.out.println("THURSDAY");break;
            case 5:
                System.out.println("FRIDAY");break;
            case 6:
                System.out.println("SATURDAY");
        }
    }
}
