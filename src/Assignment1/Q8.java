/* Write a java program to exchange the values of two variables of integer type A and B without using third temporary
variable */

package Assignment1;

public class Q8 {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        System.out.println("Before swapping A="+a+" and B="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After exchange A="+a+" and B="+b);

    }
}
