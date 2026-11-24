
package wix1002.lab.pkg06;
import java.util.Scanner;
import java.util.Random;

public class q5 {
    
    public static int check(int a, int b, int result){
        int count=0;
        if((a*b)==result){
            count++;
        }
        return count;
    }
    
    
    public static void main(String[] args) {
        Random rand=new Random();
        int count=0;
        boolean integerispositive=true;
        Scanner in= new Scanner(System.in);
        
        System.out.println("enter negative number to quit.");
        
        while(integerispositive==true){
        int a=rand.nextInt(12);
        int b=rand.nextInt(12);
        System.out.print(a+" x "+b+" = ");
        int result= in.nextInt();
        count=count+check(a,b,result);
        
        if(result<0){
            System.out.println("Your score is: "+count);
            break;
        }
    }
}
}
