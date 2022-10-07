/* Write a java program to exchange the values of two variables of integer type A and B using third temporary
variable C. */

package Assignment1;

public class Q7 {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        System.out.println("Before swapping A="+a+" and B="+b);
        int c=0;
        c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("After swapping A="+a+" and B="+b);

    }
}
