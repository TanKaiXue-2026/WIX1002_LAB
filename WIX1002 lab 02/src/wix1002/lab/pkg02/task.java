
package wix1002.lab.pkg02;
import java.util.Scanner;
// TASK: Submit with matric number

// Write a program that takes numbers and text and prints them in 10 different kidns of formatting.
 

public class task {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int integer=temp.nextInt();
        temp.nextLine();
                
        System.out.print("Enter a decimal number: ");
        double num = temp.nextDouble();
        temp.nextLine();
        
        System.out.printf("Enter a text: ");
        String text=temp.nextLine();
        System.out.println(" ");
        
        System.out.printf("1.Normal text: %s%n",text);
        
        String Uppercase = text.toUpperCase();
        System.out.println("2.Uppercase Text: "+Uppercase);
        
        System.out.printf("3.Standard Decimal: %f%n",num);
        
        System.out.printf("4.two decimal number: %.2f%n",num);
        
        System.out.printf("5.whole number: %d%n",integer);
        
        System.out.printf("6.new line: %n"+text);
        System.out.println(" ");
        
        System.out.printf("7.at least 5 wide, right: |%5d|%n",integer);
        
        System.out.printf("8.at least 5 wide, left: |%-5d|%n", integer);
        
        System.out.printf("9.width 6, 2 decimals: |%6.2f|%n", num);
        
        System.out.printf("10.Scientific Notation: %e%n",num);
        
        temp.close();
    }
    
    
}
