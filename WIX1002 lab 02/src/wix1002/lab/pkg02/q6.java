
package wix1002.lab.pkg02;
import java.util.Scanner;

//6. Write a program that calculates the energy needed to heat water

public class q6 {
    
   public static double calculator(int M,double b, double c){
       double Q=(M/1000.0)*(c-b)*4184;
       return Q;
   }
    
    
    public static void main(String[] args) {
        Scanner temp= new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        int water = temp.nextInt();
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double ini_tempF= temp.nextDouble();
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double final_tempF= temp.nextDouble();
        
        double ini_tempC = q1.convert(ini_tempF);
        double final_tempC= q1.convert(final_tempF);
        
        double result=calculator(water,ini_tempC,final_tempC);
        System.out.printf("The evergy needed is: %e" ,result);
        
    }
}
