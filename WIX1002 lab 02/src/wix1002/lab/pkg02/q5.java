
package wix1002.lab.pkg02;
import java.util.Random;

public class q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int max=10000;
        int num=rand.nextInt(max);
        System.out.println("the digit is: "+num);
        int temp = num;
        int sum=0;
        
        while(temp>0){
            int floating = temp%10;
            sum = sum + floating;
            System.out.println(floating+" ");
            temp= temp/10;
        }
        System.out.println("the sum of digits is: "+sum);
    }
}
