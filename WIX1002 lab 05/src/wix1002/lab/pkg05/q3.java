/*
3. Write a program that randomly generate the seven day work hours (1-8 hours) for N
employee. Then, display the work hours in seven days and the total hours for each employee
*/

package wix1002.lab.pkg05;
import java.util.Random;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner in=new Scanner(System.in);
        System.out.print("enter how many worker: ");
        int bilangan= in.nextInt();
        int[][] worker= new int[bilangan][7];
        int[] total=new int[bilangan];
        String format = "%4s%4s%4s%4s%4s%4s%4s%4s%6s%n";
        String columnFormat = "%4s";
         
        
        
        for(int i=0;i<bilangan;i++){
            for(int j=0;j<7;j++){
                worker[i][j]=rand.nextInt(8)+1;
                total[i]+=worker[i][j];
            }
            
        }
        
        System.out.printf(format,"num", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Total");
        for(int i=0;i<bilangan;i++){
            System.out.printf("%4s",i + 1);
            for(int j=0;j<7;j++){
                System.out.printf(columnFormat, worker[i][j]);

                
            }
            System.out.printf("%6s",total[i]);
            System.out.println("");
            
        }
        
        
    } 
    
}
