
package wix1002.lab.pkg02;
import java.util.Scanner;
//1. Write a program that convert the temperature in degree Fahrenheit to degree Celsius.
//The program will display the degree Celsius in two decimal places.
public class q1 {
    public static double convert(double a){
        double celcius =(a-32)/1.8;
        return celcius;
    }

 
    public static void main(String[] args) {
        Scanner temp =new Scanner(System.in);
        System.out.println("enter the temperature in Fahrenheit: ");
        
        double keyin= temp.nextDouble();
        double result = convert(keyin);
        
        System.out.printf("The temp in degree Celcius is %.2f ", result);
        temp.close();
    }
    
}
