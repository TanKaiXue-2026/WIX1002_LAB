
/*2. Write a program that generates 10 non-duplicate random integers within the range
from 0 to 20.
*/
package wix1002.lab.pkg05;
import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        Random rand=new Random();
        int[] num=new int[10];
        for(int i=0;i<10;i++){
            num[i]=rand.nextInt(21);
            for (int a=0;a<i;a++){
                if(num[i]==num[a]){
                    i--;
                    break;
                }
            }
            
        }
        for (int b=0;b<10;b++){
            System.out.println(num[b]+" ");
    }
    }
}
