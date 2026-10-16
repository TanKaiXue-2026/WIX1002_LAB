
package wix1002.lab.pkg02;
import java.util.Scanner;

public class q2 {
    
    public static double calculator(double P, double D, double R, double Y){
        double M=((P-D)*(1+R*Y/100)/(Y*12));
        return M;
    }
    
    
    
    public static void main(String[] args) {
        Scanner temp=  new Scanner(System.in);
        System.out.println("enter the price of the car: ");
        double car = temp.nextDouble();
        System.out.println("enter the down payment: ");
        double down = temp.nextDouble();
        System.out.println("enter the interest rate in %: ");
        double interest = temp.nextDouble();
        System.out.println("enter the loan duration in year: ");
        double duration= temp.nextDouble();
        double result = calculator(car,down,interest,duration);
        System.out.printf("the monthly payment is: %.2f",result);
        temp.close();
        
    }
}
