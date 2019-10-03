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
import javax.swing.JTextField;

public class TextFieldDemo extends JFrame {
   private Container c;
    private JTextField tf1,tf2;
    private Font f;
    TextFieldDemo()
    {
    initComponent();
    
    }
    public void initComponent()
    {
        c = this.getContentPane();
        c.setBackground(Color.red);
        c.setLayout(null);
        f = new Font("Arival",Font.BOLD + Font.ITALIC,10);
        
        tf1  = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        tf1.setFont(f);
        tf1.setForeground(Color.blue);
        tf1.setBackground(Color.pink);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
        tf2 = new JTextField("sajedul");
        tf2.setBounds(50, 110, 200, 50);
        tf2.setForeground(Color.pink);
        tf2.setBackground(Color.blue);
        tf2.setFont(f);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);
    
    
    
    }
    
    public static void main(String[] args) {
       TextFieldDemo frame = new TextFieldDemo();
       frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(100, 50, 500, 500);
       frame.setTitle("javatext field");
       
    }
}
