

package swing;
 
import java.awt.Color;
import java.awt.Container;import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 
public class ActionDemo extends JFrame {
    private Container c;
    private JTextField f1,f2;
    
    
    ActionDemo()
    {
    sajidComponent();
    
    }
    
    public void sajidComponent()
    {
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.red);
    f1 = new JTextField("sajedul");
    f1.setBounds(50,50,150,55);
    c.add(f1);
    f2 = new JTextField("Islam");
    f2.setBounds(50, 110, 150, 50);
    c.add(f2);
    
    f1.addActionListener(new ActionListener(){
        
    public void actionPerformed(ActionEvent e) 
    {
    String s = f1.getText();
    if(s.isEmpty())
    {
    
        JOptionPane.showMessageDialog(null, "you didn't enter anything ");
        
    }
    else
    {
    JOptionPane.showMessageDialog(null, "f1 = "+s);
    
    }
    JOptionPane.showMessageDialog(null,"f1 = "+s );
    
    
    }   
        
    });
    
     
    f2.addActionListener(new ActionListener(){
        
    public void actionPerformed(ActionEvent e) 
    {
    String s = f2.getText();
    if(s.isEmpty())
    {
    
        JOptionPane.showMessageDialog(null, "you didn't enter anything ");
        
    }
    else
    {
    JOptionPane.showMessageDialog(null, "f2 = "+s);
    
    }
    JOptionPane.showMessageDialog(null,"f2 = "+s );
    
    
    }   
        
    });
    
    
    
    }
    
    public static void main(String[] args) {
        ActionDemo  frame = new ActionDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 300, 400);
        
    
    }
    
}
