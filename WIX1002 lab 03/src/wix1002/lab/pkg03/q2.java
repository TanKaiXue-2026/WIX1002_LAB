
package wix1002.lab.pkg03;
import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        
    
    Random rand=new Random();
    int a= rand.nextInt(6);
        System.out.println(a+" is ");
    
    switch(a){
    case(0):
        System.out.print("zero");
        break;
    
    case(1):
        System.out.print("one");
     break;
    
    case(2):
        System.out.print("two");
        break;
        
    case(3):
        System.out.print("three");
        break;
        
    case(4):
        System.out.print("four");
        break;
        
    case(5):
        System.out.println("five");
        break;
    }
}
}
