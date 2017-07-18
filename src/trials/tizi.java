/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trials;
import javax.swing.JOptionPane;

public class tizi {
    public static void main(String[] args) {
        /*String Name= JOptionPane.showInputDialog("Enter your name.");
        if (Name.equals("Dennis")) {
            String user= ("Admin");
             JOptionPane.showMessageDialog(null, "Welcome Admin.");
           
        }else{
            JOptionPane.showMessageDialog(null, "Wrong username! Try again?");
        }*/
        /*
        String[]name;
        name= new String[3];
        name[0]="Dennis";
        name[1]="Alice";
        name[2]="Sylvia";
         for (int i = 0; i <3; i++) {
             System.out.println(name[i]);
        }*/
         
         int[]no;
         no= new int[3];
         
         for (int i = 0; i <3; i++) {
            no[i]= Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
            System.out.println(no[i]);
        }
         
         
    }
    
}
