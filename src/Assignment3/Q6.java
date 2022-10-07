/*
You can use Cramer’s rule to solve the following 2 X 2 system of linear equation:
𝑎𝑥 + 𝑏𝑦 = 𝑒
𝑐𝑥 + 𝑑𝑦 = 𝑓
𝑥 =(𝑒𝑑 − 𝑏𝑓)/(𝑎𝑑 − 𝑏𝑐)
𝑦 =(𝑎𝑓 − 𝑒𝑐)/(𝑎𝑑 − 𝑏𝑐)
Write a java program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.”
Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
x is -2.0 and y is 3.0
Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
The equation has no solution
 */

package Assignment3;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,e,f,x,y;
        System.out.print("Enter the value of a,b,c,d,e,f: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=sc.nextDouble();
        e=sc.nextDouble();
        f=sc.nextDouble();
        if(a*d-b*c==0){
            System.out.println("The equation has no solution.");
        }else{
            x=(e*d-b*f)/(a*d-b*c);
            y=(a*f-e*c)/(a*d-b*c);
            System.out.println("X is: "+x+" and Y is "+y);

        }
    }
}
