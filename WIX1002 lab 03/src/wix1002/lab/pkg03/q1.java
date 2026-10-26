
package wix1002.lab.pkg03;
import java.util.Scanner;
//
public class q1 {
    
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the two integer: ");
        double a=in.nextDouble();
        double b=in.nextDouble();
        in.nextLine();
        
        System.out.println("enter the character: ");
        char character= in.next().charAt(0);
        
        switch(character){
                case'+':
                    System.out.println(a+b);
                    break;
                case'-':
                    System.out.println(a-b);
                    break;
                case'*':
                    System.out.println(a*b);
                    break;
                case'/':
                    System.out.println(a/b);
                    break;
                case'%':
                    System.out.println(a%b);
                    break;
        }
        
        
    }
    
}
