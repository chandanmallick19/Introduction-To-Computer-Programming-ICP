/*
Write a java program that reads in investment amount, annual interest rate,
and number of years, and displays the future investment value using the following formula:
futureInvestmentValue=investmentAmount x(1+𝑚𝑜𝑛𝑡𝑙𝑦𝐼𝑛𝑡𝑒𝑟𝑒𝑠𝑡𝑅𝑎𝑡𝑒)𝑛𝑢𝑚𝑏𝑒𝑟𝑂𝑓𝑌𝑒𝑎𝑟𝑠∗12
For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1,
the future investment value is 1032.98
 */

package Assignment2;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double investmentAmount,monthlyInterestRate,numberOfYears,futureInvestmentValue;
        System.out.println("Enter the amount: ");
        investmentAmount=sc.nextDouble();
        System.out.println("Enter annual interest rate: ");
        double annualInterestRate=sc.nextDouble();
        monthlyInterestRate=annualInterestRate/1200;
        System.out.println("Enter the number of years: ");
        numberOfYears=sc.nextDouble();
        futureInvestmentValue=investmentAmount*Math.pow((1+monthlyInterestRate),numberOfYears*12);
        System.out.println("The future investment value is "+futureInvestmentValue);
    }
}
