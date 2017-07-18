
package trials;

import java.util.Random;
import javax.swing.JOptionPane;


public class While_Do {

    public static void main(String[] args) {
        
        Random r=new Random();
        int i=0;
        int Gift=10;
    
        while(i<5){
           int win=(Gift*i); 
            
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter your Lotto Number:Any number between 0-9... Cost 10/="));
            int winningNo= r.nextInt(10);
            if (winningNo==num) {
                JOptionPane.showMessageDialog(null, "Congructulations...You won!!!"+ "You made Ksh "+ win );
                
                break;
            }else{
                   
                JOptionPane.showMessageDialog(null, "Sorry! Better luck next time." +"The winning number is "+winningNo);
                i++;
            }
        }
             
        
    }
}
