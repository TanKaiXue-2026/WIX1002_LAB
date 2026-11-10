/*Write a program that generates 20 random integers within the range from 0 to 100.
Sort the array in descending order. Then, accepts an integer input from the user. 
Then, search the array using this number. Compare the performance of linear search and binary search.
*/

package wix1002.lab.pkg05;
import java.util.Scanner;
import java.util.Random;

public class q5 {
      
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rand=new Random();
        int[] integers=new int[20];
        int countlinear=0, countbinary=0;
        int binaryleft = 0;
        int binaryright = integers.length - 1;
        for (int i=0;i<20;i++){
            integers[i]=rand.nextInt(101);
        }
        System.out.println("A list of 20 random integer within 0 to 100: ");
        for (int i=0;i<20;i++){
            System.out.print(integers[i]+", ");
        }
        
        System.out.println("");
        
        for (int i=0;i<integers.length;i++){
            for (int j=0;j<integers.length-1;j++){
                   if (integers[j] < integers[j + 1]) {
                      int temp = integers[j];
                      integers[j] = integers[j + 1];
                      integers[j + 1] = temp;
              }
                   
            }
            countlinear+=1;
        }
        
        System.out.println("Array in descending order: ");
          for (int i = 0; i < 20; i++) {
              System.out.print(integers[i]+", ");
          }
        
          System.out.println("");
          
          System.out.print("Enter a number to search: ");
          int input=in.nextInt();
          
          System.out.println("");
          
         for (int i=0;i<20;i++){
            if(input==integers[i]){
                System.out.println(integers[i]+" found");
                System.out.println("Linear search - "+countlinear+" loop(s)");
            }
        }
         
         while (binaryleft <= binaryright) {
              countbinary++;
         int mid = binaryleft + (binaryright - binaryleft) / 2;
           if (integers[mid] == input) {
                  break;
              } else if (integers[mid] > input) {
                  // Since array is descending, if mid element > target, target is to the right
                  binaryleft = mid + 1;
              } else {
                  // If mid element < target, target is to the left
                  binaryright = mid - 1;
              }
          }
         System.out.println(input+" found");
         System.out.println("Binary search - "+countbinary+" loop(s)");
    }
}
