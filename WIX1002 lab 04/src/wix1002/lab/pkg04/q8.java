package wix1002.lab.pkg04;
import java.util.Random;

public class q8 {
    public static void main(String[] args) {
        Random rand = new Random();         
        int n = rand.nextInt(100); 
        
        System.out.println("Generated random number n = " + n);
        
        if (n == 0) {
            System.out.println("There are no prime numbers to display.");
        } 
        else {
            System.out.println("The first " + n + " prime numbers is:");
            
            int count = 0;  
            int num = 2;    

            while (count < n) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false; 
                        break;           
                    }
                }
                
                if (isPrime) {
                    System.out.print(num + " ");
                    count++;
                }
                
                num++;
            }
            System.out.println(); 
        }
    }
}