
package wix1002.lab.pkg03;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        
        System.out.println("enter the total sales: ");
        Scanner in= new Scanner(System.in);
        double sales = in.nextDouble();
        System.out.println("The total sales is "+sales);
        
        if (sales <=100){
            double a=sales*0.05;
            System.out.println("Commission is "+a);
        }
        else if(sales<=500){
            double b=sales*0.075;
            System.out.println("Commission is "+b);
        }
        else if(sales<=1000){
            double c=sales*0.1;
            System.out.println("Commission is "+c);
        }
        else{
            double d=sales*0.125;
            System.out.println("Commission is "+d);
        }
        
    }
}
