
package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MessageDialog3 {
    public static void main(String[] args) {
        ImageIcon img = new   ImageIcon("sajid.jpg");
        JOptionPane.showMessageDialog(null,"enter correct password","this is a title",JOptionPane.PLAIN_MESSAGE,img);
    }
    
}
