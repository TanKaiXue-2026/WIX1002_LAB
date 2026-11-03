
package wix1002.lab.pkg04;
import java.util.Scanner;

public class WIX1002Lab04 {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a= in.nextInt();
        int i=1;
        System.out.println("The factors are: ");
        while(i<=a){
            if (a%i==0){
                System.out.print(i+",");
               
            }
            i++;
        }
    }
    
}
