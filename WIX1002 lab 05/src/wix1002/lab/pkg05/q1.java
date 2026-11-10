/*
1. Write a program to randomly generate N student scores (0-100). 
The program will prompt the user to enter N students and store the score in an array. 
Then, the program will display a list of score, the highest score, the lowest score and the average score.
*/
package wix1002.lab.pkg05;
import java.util.Scanner;
import java.util.Random;

public class q1 {
   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("enter the number of student: ");
        int bilangan = in.nextInt();
        int[] student=new int[bilangan];
        int max=0,min=1000000,total=0,b=1;
        double ave=0;
        
        for(int i=0;i<bilangan;i++){
            student[i]=rand.nextInt(101);
            if (student[i]>max){
                max=student[i];
            }
            else if (student [i]<min){
                min=student[i];
            }
            total+=student[i];
        }
        
        for (int a=0;a<bilangan;a++){
            System.out.println(b+". "+student[a]);
            b++;
        }
        ave=(total/bilangan);
        System.out.println("the max of the score is: "+max);
        System.out.println("the min of the score is: "+min);
        System.out.println("the average of the score is: "+ave);
        
    }
    
}
