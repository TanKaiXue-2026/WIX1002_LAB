
package wix1002.lab.pkg03;
import java.util.Random;

public class q4 {
    
    public static int dice(){
        Random a= new Random();
        int num=a.nextInt(6)+1;
        return num;
    }
    public static void main(String[] args) {
        int a=dice();
        System.out.println("the first player roll "+a);
        int b=dice();
        System.out.println("the first player roll again is "+b);
        
        int c=dice();
        System.out.println("the second player roll "+c);
        int d=dice();
        System.out.println("the second player roll again is "+d);
        
        if (a>c||a>d||b>c||b>d){
            System.out.println("first player won");
        }
        else if(c>a||c>b||d>a||d>b){
            System.out.println("second player won");
        }
        
    }
}
