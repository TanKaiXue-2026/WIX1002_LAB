
package wix1002.lab.pkg06;

public class q1 {
    
    public static int triangularNumber(int n) {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
          sum = sum + i;
      }
      return sum;
  }

    public static void main(String[] args) {
        System.out.println("first 20 triangular method: ");
        for (int i = 1; i <= 20; i++) {
          int result = triangularNumber(i);
          System.out.println("T" + i + " = " + result);
      }
  }
    }
    

