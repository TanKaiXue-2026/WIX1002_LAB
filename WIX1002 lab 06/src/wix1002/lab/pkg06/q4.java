
package wix1002.lab.pkg06;


public class q4 {
    
    public static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        else{
           return GCD(b,a%b);
        }
    }
    
    public static void main(String[] args) {
        int[] num1= {24,8};
        int[] num2= {200,625};
        int result1= GCD(num1[0],num1[1]);
        int result2= GCD(num2[0],num2[1]);
        System.out.println(result1);
        System.out.println(result2);
    }
    }

