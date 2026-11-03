
package wix1002.lab.pkg04;
import java.util.Random;


public class q6 {
    public static void main(String[] args) {
        Random in=new Random();
        int a =in.nextInt(Integer.MAX_VALUE);
        System.out.println("generated number: "+a);
        while(a>0){
            int temp=a%10;
            System.out.println(temp);
            a=a/10;
        
        }
    }
}
