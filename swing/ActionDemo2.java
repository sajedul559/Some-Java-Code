
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ActionDemo2 extends JFrame{
    private Container s;
    private JTextField tf;
    private JButton bt;
   ActionDemo2()
   {
   s = this.getContentPane();
   s.setLayout(null);
   s.setBackground(Color.CYAN);
   tf = new JTextField();
   tf.setBounds(50,50,150,50);
   s.add(tf);
   
   bt =  new JButton("Clear");
   bt.setBounds(50, 110, 80, 50);
   s.add(bt);
    bt.addActionListener(new ActionListener(){
        
    public void actionPerformed(ActionEvent e) 
    {
    
   tf.setText("");
    
    }   
        
    });
    
   
   
   
   
   }
   
    public static void main(String[] args) {
        
     
       
        ActionDemo2  frame = new ActionDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 300, 400);
        frame.setTitle("JAction Demo");
    }
}
