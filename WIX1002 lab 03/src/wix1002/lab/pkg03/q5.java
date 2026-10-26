
package wix1002.lab.pkg03;
import java.util.Scanner;

public class q5 {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a");
        int a=in.nextInt();
        System.out.println("enter b");
        int b=in.nextInt();
        System.out.println("enter c");
        int c=in.nextInt();
        System.out.println("enter d");
        int d=in.nextInt();
        System.out.println("enter e");
        int e=in.nextInt();
        System.out.println("enter f");
        int f=in.nextInt();
  
       
        
        int check=(a*d)-(b*c);
        double x=0;
        double y=0;
        
        if (check ==0){
            System.out.println("The equation has no solution");
        }
        else
            x=((e*d)-(b*f))/check;
            y=((a*f)-(e*c))/check;
            System.out.println("x is: "+x);
            System.out.println("y is: "+y);
    }
}
