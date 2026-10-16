
    package wix1002.lab.pkg02;

    import java.util.Scanner;

    public class q4 {

        public static int hour(int a){
            int result = a/3600;
            return result;
        }
        
        public static int leftover_hour(int b){
           int result = b%3600;
            return result;
        }
        
        public static int minutes(int c){
            int result = c/60;
            return result;
        }
        
        public static int leftover_minute(int d){
            int result = d%60;
            return result;
        }


        public static void main(String[] args) {
            Scanner temp = new Scanner(System.in);
            System.out.print("Enter the number of seconds: ");
            int seconds= temp.nextInt();
            int hours = hour(seconds);
            int leftover_minutes= leftover_hour(seconds);
            int minutes = minutes(leftover_minutes);
            int second = leftover_minute(leftover_minutes);
            System.out.printf(seconds+" seconds is %d hours, %d minutes and %d seconds",hours, minutes, second);
            System.out.println("");
        }
    }
