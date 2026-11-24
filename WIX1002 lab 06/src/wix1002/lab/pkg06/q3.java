package wix1002.lab.pkg06;
import java.util.Scanner;

public class q3 {
    
    public static int[] reverse(int[] a) {
        int[] result = new int[a.length];
        
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            result[i] = a[j];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] b = new int[10];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 10 Integers: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
        }
        
               int[] result = reverse(b);
        
        
        System.out.print("Reversed array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
        in.close();
    }
}