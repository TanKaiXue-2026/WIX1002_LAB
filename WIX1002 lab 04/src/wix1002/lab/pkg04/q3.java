
package wix1002.lab.pkg04;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        boolean b=true;
        int total=0, max=0,min=1000000000,count=0,x1=0;
        
        while( b == true){
        
        System.out.print("Enter a score (negative to quit): ");
        int a=in.nextInt();
        if(a<0){
            b=false;
        }
        if(a>0){
        total+=a;
        count++;
        x1+=(a*a);
        if(a>max){
            max=a;
        }
        if(a<min){
            min=a;
        }
        }
        
        }
        double average=(double)total/count;
        double variance=((x1-((total*total)/count))/(count-1));
        double sd=Math.sqrt(variance);
        
        System.out.println("minimum: "+min);
        System.out.println("maximum: "+max);
        System.out.println("average: "+average);
        System.out.printf("standard deviation: %.2f",sd);
        System.out.println(" ");
        
      
    }
}
