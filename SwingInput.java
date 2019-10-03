package swing;

import javax.swing.JOptionPane;


public class SwingInput {
    public static void main(String[] args) {
        
       //String name = JOptionPane.showInputDialog("Enter Your Name");
   
   // JOptionPane.showMessageDialog(null, name + "welcome to swing");
 int choice = JOptionPane.showConfirmDialog(null,"Do you want to quit this program", "title",JOptionPane.YES_NO_OPTION );
 if(choice == JOptionPane.YES_OPTION)
 {
     System.out.println("You press yes");
 }
 else
 {
 
     System.out.println("You Have choice no option");
 }
    //String F_name = JOptionPane.showInputDialog(null,"Enter your f_name", "this is title",JOptionPane.QUESTION_MESSAGE);
      //  String L_name = JOptionPane.showInputDialog(null,"Enter your L_name");
        //String name = F_name +"  "+ L_name;
        //JOptionPane.showMessageDialog(null,"your full name is: " + name);
    }
}
