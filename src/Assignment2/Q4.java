/* Write a java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
For example, if an integer is 932, the sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
For instance, 932 % 10 = 2 and 932 / 10 = 93.
Here is a sample run:
Enter a number between 0 and 1000: 999
The sum of the digits is 27
 */

package Assignment2;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Integer between 0 to 100 : ");
        int num=sc.nextInt();
        int rem=num%10;
        num=num/10;
        rem=rem+num%10;
        num=num/10;
        rem=rem+num;
        System.out.println("The sum of the entered number is : "+rem);
    }
}
