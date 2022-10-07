/*
If the ages of Rahul, Ayush and Ajay are input through the keyboard,
write a java program to determine the elder among them
 */
package Assignment3;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the age of Rahul: ");
        a=sc.nextInt();
        System.out.println("Enter the age of Ayush: ");
        b= sc.nextInt();
        System.out.println("Enter the age of Ajay: ");
        c=sc.nextInt();
        if(a>b && a>c)
            System.out.println("Rahul is elder among all");
        else if(b>a & b>c)
            System.out.println("Ayush is elder among all");
        else
            System.out.println("Ajay is elder among all");
    }
}
