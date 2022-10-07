/*
Any character is entered through the keyboard,
write a java program to determine whether the character entered is a capital letter, a small case letter, a digit or a special symbol.
The following table shows the range of ASCII values for various characters.
Characters ASCII Values
A – Z 65 – 90
a – z 97 – 122
0 – 9 48 – 57
special symbols 0 - 47, 58 - 64, 91 - 96, 123 – 127
 */

package Assignment3;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char user=sc.next().charAt(0);
        if(65<=user && user<=90){
            System.out.println("The entered character is a capital case letter");
        }else if(97<=user && user<=122){
            System.out.println("The entered character is a small case letter");
        }else if(48<=user && user<=57){
            System.out.println("The entered character is a digit");
        }else if((0<=user && user<=47)||(58<=user && user<=64)||(91<=user && user<=96)||(123 <= user)){
            System.out.println("The entered character is a special symbol");
        }else{
            System.out.println("The character is invalid.");
        }
    }
}
