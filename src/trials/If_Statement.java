
package trials;
import javax.swing.JOptionPane;

public class If_Statement {
    
    public static void main(String[] args) {
       /* String name=JOptionPane.showInputDialog("Who is your favourite CFO?");
        if (name.equals("Bob Collimore")) {
          JOptionPane.showMessageDialog(null ,"Bob Collimore is the CFO of Safaricom.");
            
        }else if (name.equals("James Mwangi")) {
            JOptionPane.showMessageDialog(null, "James Mwangi is the CFO of Equity Bank.");
        }
        else{
            System.out.println("Wrong Entry!");
        }
    }*/
    
       /*
       String name=JOptionPane.showInputDialog("Enter your name.");
        if (name.equals("Dennis")) {
            JOptionPane.showConfirmDialog(null, name);
            
        }*/
       /*
       int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
        if (age<18) {
            JOptionPane.showMessageDialog(null, "Under aged individual. Head back.");
        }else{
            JOptionPane.showMessageDialog(null, "Welcome to Club J.");
        }
       */
       //switch
       int points=Integer.parseInt(JOptionPane.showInputDialog("Enter your score points."));
       switch(points) {
           case 12:
               JOptionPane.showMessageDialog(null, "A");
               break;
           case 11:
                JOptionPane.showMessageDialog(null, "A-");
                break;
                 case 10:
                JOptionPane.showMessageDialog(null, "B+");
                break;
                 case 9:
                JOptionPane.showMessageDialog(null, "B");
                break;
                 case 8:
                JOptionPane.showMessageDialog(null, "B-");
                break; case 7:
                JOptionPane.showMessageDialog(null, "C+");
                break; case 6:
                JOptionPane.showMessageDialog(null, "C");
                break; case 5:
                JOptionPane.showMessageDialog(null, "C-");
                break; case 4:
                JOptionPane.showMessageDialog(null, "D+");
                break; case 3:
                JOptionPane.showMessageDialog(null, "D");
                break; case 2:
                JOptionPane.showMessageDialog(null, "D-");
                break;
                 case 1:
                JOptionPane.showMessageDialog(null, "E");
                break;
       }
    }
}
    
