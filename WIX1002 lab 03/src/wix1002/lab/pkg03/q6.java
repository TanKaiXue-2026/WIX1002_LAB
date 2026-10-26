
package wix1002.lab.pkg03;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the radius of the circle: ");
        int radius=in.nextInt();
        System.out.println("enter a coordinate point : ( , )");
        int x=in.nextInt();
        int y=in.nextInt();
        
        double distance= x*x+y*y;
        if ((radius*radius)<distance){
            System.out.println("The point is inside the circle.");
        }
        else if ((radius*radius)>distance){
            System.out.println("The point outside inside the circle.");
        }
        else{
            System.out.println("The point on inside the circle.");
        }
    }
}
