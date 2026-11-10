//4. Write a program that rotates 90 degrees clockwise a 3 by 3 matrix.
package wix1002.lab.pkg05;
import java.util.Random;

public class q4 {
    public static void main(String[] args) {
        Random rand=new Random();
        System.out.println("matrix 3x3: ");
        int[][] mat=new int[3][3];
        int[][] newmat=new int[3][3];
        
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                mat[i][j]=rand.nextInt(10);
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
        
        newmat[0][0]=mat[2][0];
        newmat[1][0]=mat[2][1];
        newmat[2][0]=mat[2][2];
        newmat[0][1]=mat[1][0];
        newmat[1][1]=mat[1][1];
        newmat[2][1]=mat[1][2];
        newmat[0][2]=mat[0][0];
        newmat[1][2]=mat[0][1];
        newmat[2][2]=mat[0][2];
        
        System.out.println("");
        System.out.println("After rotates 90 degree clockwise");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                mat[i][j]=rand.nextInt(10);
                System.out.print(newmat[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
}
