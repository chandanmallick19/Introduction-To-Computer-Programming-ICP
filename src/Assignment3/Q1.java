/*
Write a java program to input the height of the person and
check if the height of the person is greater than or equal to 6 feet
then print the message “The person is tall”.
 */

package Assignment3;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height of the person in feet: ");
        double height=sc.nextDouble();
        if(height>=6.0){
            System.out.println("The person is tall");
        }else{
            System.out.println("The person is short");
        }
    }
}
