
package swing;

import javax.swing.JFrame;

public class Frame extends JFrame{
    Frame()
    {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(500, 100, 400, 500);
       setTitle("Frame Demo");

    
    
    }
  
    public static void main(String[] args) {
       
                
         JFrame frame = new JFrame();
     
        frame.setVisible(true);
        //frame.setSize(400, 300);
        //frame.setLocationRelativeTo(null);
       // frame.setLocation(200, 50);
    //frame.setResizable(false);
    
    }
}
