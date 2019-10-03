
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ButtonDemo extends JFrame{
    private Container s;
    private JButton btn1,btn2;
    private Font f;
    private Cursor cursor;
    ButtonDemo()
    {
    
    sajidComponents();
    
    
    }
    public void sajidComponents()
    {
    s = this.getContentPane();
    s.setLayout(null);
    s.setBounds(110,50,400,500);
    s.setBackground(Color.red);
    f = new Font("Arival",Font.BOLD + Font.ITALIC,15);  
    
    cursor = new Cursor(Cursor.CROSSHAIR_CURSOR);
   btn1 = new JButton("submit");
   btn1.setFont(f);
   btn1.setCursor(cursor);
   btn1.setBounds(100, 50, 100, 50);
   btn1.setForeground(Color.GRAY);
   btn1.setBackground(Color.ORANGE);
   s.add(btn1);
    btn2 = new JButton("clear");
    btn2.setFont(f);
    btn2.setCursor(cursor);
    btn2.setForeground(Color.darkGray);
    btn2.setBackground(Color.ORANGE);
   btn2.setBounds(220, 50, 100, 50);
   s.add(btn2);
    
    }
    
    
    
    public static void main(String[] args) {
        ButtonDemo  frame = new ButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("JButton Demo");
    }
}
