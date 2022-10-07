/*
Body Mass Index (BMI) is a measure of health on weight.
It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters.
Write a java program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
Here is a sample run:
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
 */

package Assignment2;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Enter weight in pounds: ");
        weight=sc.nextDouble();
        System.out.print("Enter height in inches: ");
        height=sc.nextDouble();
        weight=weight*0.445359237;
        height=height*0.0254;
        bmi=weight/(height*height);
        System.out.println("BMI is "+bmi);
    }
}
