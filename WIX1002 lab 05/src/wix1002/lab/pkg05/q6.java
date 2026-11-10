
package wix1002.lab.pkg05;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int rows = in.nextInt();
        System.out.println("The Pascal Triangle with " + rows + " row(s)");
        int[][] matrix = new int[rows][rows];
        
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
            }
        }
        
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println(); 
        }
    }
}
