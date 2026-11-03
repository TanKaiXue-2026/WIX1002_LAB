
package wix1002.lab.pkg04;
import java.util.Random;

public class q5 {
    
    public static int dice(){
        Random random=new Random();
        int point= random.nextInt(6)+1;
        return point;
    }
    
    public static void main(String[] args) {
        int total1=0,total2=0;
        boolean one=false,two=false;
        
        while(one==false && two==false){
            
            int score1=dice();
            System.out.println("Player 1 roll: "+score1);
            total1+=score1;
            if (score1==6){
                int rollagain1=dice();
             System.out.println("Player 1 roll again: "+ rollagain1);
             total1+=rollagain1;
        }    System.out.println(" ");        
        

            int score2=dice();
            System.out.println("Player 2 roll: "+score2);
            total2+=score2;
            if (score2==6){
                int rollagain2=dice();
             System.out.println("Player 2 roll again: "+ rollagain2);
             total1+=rollagain2;
        }   System.out.println(" ");    
            
            if(total1>=100){
                one=true;
                System.out.println("the winner is player one with point "+ total1);
            }
            else if(total2>=100){
                two=true;
                System.out.println("the winner is player two with point "+ total2);
            }
        
        }
    }
}
