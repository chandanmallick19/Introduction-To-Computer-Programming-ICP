/*
The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body
fat in populations. It is computed by taking the individual's weight (mass) in kilograms and
dividing it by the square of their height in meters.
Write a java program by using some if statements to show the category for a given BMI.
 */

package Assignment3;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the person(in KG): ");
        double weight = sc.nextDouble();
        System.out.println("Enter the height of the person(in Metre): ");
        double height = sc.nextDouble();
        double BMI = (weight / Math.pow(height, 2));
        if (BMI < 18.5)
            System.out.println("The person has underweight.");
        else if (18.5 <= BMI && BMI <= 24.9)
            System.out.println("The person has normal weight");
        else if(25<=BMI && BMI<=29.9)
            System.out.println("The person has overweight");
        else if(BMI>=30)
            System.out.println("The person has obesity");
        else System.out.println("Error");
    }
}


