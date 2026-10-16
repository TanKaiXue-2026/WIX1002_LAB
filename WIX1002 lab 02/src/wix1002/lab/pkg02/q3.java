
package wix1002.lab.pkg02;
import java.util.Scanner;
import java.util.Random;

public class q3 {
    
    public static int sum(int a,int b,int c){
        int e=a+b+c;
        return e;
    }
    
    public static double ave(double a, double b, double c){
        double e = (a+b+c)/3;
        return e;
    }
    
    
    public static void main(String[] args) {
        Random rand=new Random();
        int max=40;
        int first=rand.nextInt(max)+10;
        int second=rand.nextInt(max)+10;
        int third=rand.nextInt(max)+10;
        
        double sum_result = sum(first,second,third);
        double ave_result= ave(first,second,third);
        
        System.out.println("The three numbers are: "+first+" "+second+" "+third);
        System.out.println("the sum of the numbers is: "+sum_result);
        System.out.printf("the average of the numbers is: %.2f",ave_result);
    }
}
