/*
Input an integer through the keyboard.
Write a java program to find out whether it is an odd number or even number.
 */

package Assignment3;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num=sc.nextInt();
        if(num%2==1){
            System.out.println("The number is odd");
        }else{
            System.out.println("The number is even");
        }
    }
}
