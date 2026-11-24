
package wix1002.lab.pkg06;

    
public class q2 {
    
    public static void multiPrint(int n, char c){
        for (int i = 0; i < n; i++) {
            System.out.println(c);
        }
    }
    
    public static void main(String[] args) {
          int rows = 5; // Height of upper triangle

      // 1. Triangle
      System.out.println("Triangle:");
      for (int i = 1; i <= rows; i++) {
          multiPrint(i, '*');
          System.out.println();
      }

      // 2. Diamond
      System.out.println("\nDiamond:");
      // Upper half (including middle line)
      for (int i = 1; i <= rows; i++) {
          multiPrint(rows - i, ' ');
          multiPrint(2 * i - 1, '*');
          System.out.println();
      }

      // Lower half
      for (int i = rows - 1; i >= 1; i--) {
          multiPrint(rows - i, ' ');
          multiPrint(2 * i - 1, '*');
          System.out.println();
      }
    }
}



