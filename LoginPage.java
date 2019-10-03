
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginPage extends JFrame{
    private JLabel userlabel,passlabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton Login,ClearButton;
        private Container s;
        private Font f;
    
    LoginPage()
    {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100, 50, 400, 350);
    this.setTitle("Login Page");
    
    f = new Font("Arival",Font.BOLD,14);
   s = this.getContentPane();
   s.setLayout(null);
   s.setBackground(Color.red);
   userlabel = new JLabel("UserName");
   userlabel.setFont(f);
  userlabel.setBounds(15, 50, 150, 50);
  s.add(userlabel);
  tf = new JTextField();
  tf.setFont(f);
  tf.setBounds(100, 50, 150, 50);
  s.add(tf);
  
 passlabel = new JLabel("password");
 passlabel.setBounds(15, 120, 150, 50);
 passlabel.setFont(f);
 s.add(passlabel);
  pf = new JPasswordField();
  
  pf.setFont(f);
  pf.setBounds(100, 120, 150, 50);
  s.add(pf);
 Login = new JButton("Login");
 Login.setBounds(90,190,80,40);
 Login.setFont(f);
 s.add(Login);
 ClearButton = new JButton("Clear");
 ClearButton.setBounds(180, 190, 90, 50);
 ClearButton.setFont(f);
 s.add(ClearButton);
  ClearButton.addActionListener(new ActionListener(){
        
    public void actionPerformed(ActionEvent e) 
    {
    
   tf.setText("");
      pf.setText("");

    
    }   
        
    });
    
 
    
    
    
    }
    public static void main(String[] args) {
        
        LoginPage  frame = new LoginPage();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 300, 400);
        frame.setTitle("JAction Demo");
    
    }
}
