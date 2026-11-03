
package wix1002.lab.pkg04;
import java.util.Scanner;


public class q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter an integer: " );
        int a=in.nextInt();
        int total=0;
        for(int i=1;i<=a;i++){
            total= total +i;
        }
        System.out.println(total);
        
    }
   
}
