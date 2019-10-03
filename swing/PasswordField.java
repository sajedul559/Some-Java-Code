
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;


public class PasswordField extends JFrame {
    private Container s;
    private JPasswordField pf;
    private Font f;
    PasswordField()
    {
    
    sajidComponents();
    }
    public void sajidComponents()
    {
    s = this.getContentPane();
    s.setLayout(null);
    s.setBackground(Color.cyan);
    f = new Font("Arival",Font.BOLD,15);
    
    pf = new JPasswordField();
    pf.setBounds(50, 20, 150, 50);
    pf.setEchoChar('*');
    pf.setFont(f);
    pf.setForeground(Color.RED);
    pf.setBackground(Color.GREEN);
    s.add(pf);
    
    
    }
    
    
    public static void main(String[] args) {
        PasswordField  frame = new PasswordField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 300, 400);
        frame.setTitle("Jpassword Field");
    }
    
}
