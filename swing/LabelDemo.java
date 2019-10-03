/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LabelDemo extends JFrame {
    private Container c;
    private JLabel userlabel,passlabel;
    private Font f;
    
  LabelDemo()
  {
  initComponents();
  
  }
    public void initComponents()
    {
   
    c = this.getContentPane();
    c.setBackground(Color.pink);
    c.setLayout(null);
    f = new Font("Arial",Font.BOLD,10);
    userlabel = new JLabel();
    userlabel.setText("Enter Your User Name");
    userlabel.setBounds(50,20,150,50);
    userlabel.setFont(f);
    userlabel.setForeground(Color.blue);
    userlabel.setOpaque(rootPaneCheckingEnabled);
    userlabel.setBackground(Color.red);
    userlabel.setToolTipText("enter your user name");
    
    
    
    
    c.add(userlabel);
    passlabel =  new JLabel("Enter your Password:");
  
    passlabel.setBounds(50, 70, 150, 50);
    passlabel.setFont(f);
    c.add(passlabel);
    }
    
    public static void main(String[] args) {
      LabelDemo frame = new LabelDemo();
      frame.setVisible(true);
      frame.setBounds(50, 100, 400, 500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("Title");
    
    
    
    }
    
}
