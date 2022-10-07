/* Write a program that reads a Celsius degree in a double value from the console, then
converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32 */

package Assignment2;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature in Celcius : ");
        double celcius=sc.nextDouble();
        double farenheit=(9.0/5)*celcius+32;
        System.out.print("The temperature in Farenheit is :"+farenheit);
    }
}
