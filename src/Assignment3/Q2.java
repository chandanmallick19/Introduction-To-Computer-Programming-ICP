/*
Write a java program to input the mark of a student and check
if the student mark is greater than or equal to 40, then it generates the following message.
“Congratulation! You have passed the exam.”
Otherwise the output message is
“Sorry! You have failed the exam.”
 */

package Assignment3;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark=in.nextInt();
        if(mark>=40){
            System.out.println("Congratulations! You have passed the exam.");
        }else{
            System.out.println("Sorry! You have failed the exam.");
        }
    }
}
