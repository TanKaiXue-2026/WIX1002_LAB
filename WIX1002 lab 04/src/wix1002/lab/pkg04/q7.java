
package wix1002.lab.pkg04;
import java.util.Scanner;


public class q7 {
    
    public static double monthly_payment(double P, double i, double N){
      double M=(P*(i/(12*100))/(1-Math.pow(1+(i/(12*100)),-N)));
      return M;
    }
    
    public static double principal(double a, double n ,double i,double N){
        double Cn=a*Math.pow(1+(i/(12*100)),-(1+N-n));
        return Cn;
    }
    
    public static double interest_due(double a, double b){
        double Ln=a-b;
        return Ln;
    }
    
    public static double remaining_principal(double a, double b,double i){
        double Rn= ((a/(i/(12*100)))-b);
        return Rn;
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal=in.nextInt();
        System.out.print("Enter interest in %: ");
        double interest = in.nextDouble();
        System.out.print("Enter total of month(s): ");
        double month=in.nextInt();
        double totalinterest = 0;
        
        String format ="%20s %20s %20s %20s %20s %20s\n";
        String numformat="%20s %20.2f %20.2f %20.2f %20.2f %20.2f\n";
        System.out.printf(format, "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        double M = monthly_payment(principal, interest, month);
        
        for(int i=1;i<13;i++){
            double Cn = principal(M, i, interest, month);
            double Ln = interest_due(M, Cn);
            double Rn = remaining_principal(Ln, Cn, interest);
            totalinterest += Ln;
            System.out.printf(numformat, i, M, Cn, Ln, Rn, totalinterest);
        }
        }
    }

