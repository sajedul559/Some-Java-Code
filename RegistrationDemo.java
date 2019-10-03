
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class RegistrationDemo extends JFrame implements ActionListener{
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;
    private Container s;
    private Font font;
    private JLabel Titlelabel,fnLabel,lnLabel,phoneLabel,gpaLabel;
    private JTextField fnTf,lnTf,phoneTf,gpaTf;
    private JButton AddButton,UpdateButton,DeleteButton,ClearButton;
    
    
    
    
     
    private String[] col = {"First Name","Last Name","Phone Number","GPA"};
    private String[] row = new String[4];
    
        
    
    RegistrationDemo()
    {
    initComponets();
    }
    public void initComponets()
    {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(780,690);
    this.setLocationRelativeTo(null);
    this.setTitle("Student Table");
    
    s = this.getContentPane();
    s.setLayout(null);
    s.setBackground(Color.PINK);
    
    font = new Font("Arial",Font.BOLD,16);
    
    Titlelabel = new JLabel("Student Registration");
    Titlelabel.setBackground(Color.LIGHT_GRAY);

    Titlelabel.setFont(font);
    Titlelabel.setBounds(140, 10, 250, 50);
    s.add(Titlelabel);
    
    fnLabel = new JLabel("First Name");
    fnLabel.setBounds(10, 80, 140, 30);
    fnLabel.setFont(font);
    s.add(fnLabel);
    
    fnTf = new JTextField();
    fnTf.setBackground(Color.LIGHT_GRAY);
    
    fnTf.setBounds(110, 80, 200, 30 );
    fnTf.setFont(font);
    s.add(fnTf);
    
    AddButton = new JButton("Add");
  AddButton.setBounds(400, 80, 100, 30);
  AddButton.setFont(font);
  s.add(AddButton);
  
  lnLabel = new JLabel("Last Name");
  lnLabel.setBounds(10, 130, 150, 30);
  lnLabel.setFont(font);
   s.add(lnLabel);
   
   lnTf = new JTextField();
   lnTf.setBackground(Color.LIGHT_GRAY);

   lnTf.setBounds(110, 130, 200, 30);
   lnTf.setFont(font);
   s.add(lnTf);
   
   UpdateButton = new JButton("Update");
   UpdateButton.setBounds(400, 130, 100, 30);
   UpdateButton.setFont(font);
   s.add(UpdateButton);
   
   phoneLabel = new JLabel("Phone");
   phoneLabel.setBounds(10, 180, 150, 30);
   phoneLabel.setFont(font);
   s.add(phoneLabel);
   
   phoneTf = new JTextField();
   phoneTf.setBackground(Color.LIGHT_GRAY);

   phoneTf.setBounds(110, 180, 200, 30);
   phoneTf.setFont(font);
   s.add(phoneTf);
   
   DeleteButton = new JButton("Delete");
   DeleteButton.setBounds(400, 180, 100, 30);
   DeleteButton.setFont(font);
   s.add(DeleteButton);
   
   gpaLabel = new JLabel("GPA  ");
   
   gpaLabel.setBounds(10, 230, 150, 30);
   gpaLabel.setFont(font);
   s.add(gpaLabel);
   
   gpaTf = new JTextField();
       gpaTf.setBackground(Color.LIGHT_GRAY);

   gpaTf.setBounds(110, 230, 200, 30);
   gpaTf.setFont(font);
   s.add(gpaTf);
   
   ClearButton = new JButton("Clear");
   ClearButton.setBounds(400, 230, 100, 30);
   ClearButton.setFont(font);
   s.add(ClearButton);
   
   
   table = new JTable();
   
   model = new DefaultTableModel();
   model.setColumnIdentifiers(col);
   
   table.setModel(model);
   table.setFont(font);
   table.setSelectionBackground(Color.GREEN);
   table.setBackground(Color.orange);
   table.setRowHeight(30);
   
   scroll = new JScrollPane(table);
   scroll.setBounds(10, 360, 740, 265);
   s.add(scroll);
   AddButton.addActionListener(this);
   ClearButton.addActionListener(this);
   DeleteButton.addActionListener(this);
   UpdateButton.addActionListener(this);
   
   table.addMouseListener(new MouseAdapter (){
  
   public void mouseClicked(MouseEvent me){
   
   int numberofRow = table.getSelectedRow();
   
   String f_name = model.getValueAt(numberofRow,0).toString();
   String l_name = model.getValueAt(numberofRow,1).toString();
   String phone = model.getValueAt(numberofRow,2).toString();
   String GPA = model.getValueAt(numberofRow,3).toString();
   fnTf.setText(f_name);
   lnTf.setText(l_name);
   lnTf.setText(phone);
   lnTf.setText(GPA);



   
   }
   
   });
   
   
   
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==AddButton){
        row[0]= fnTf.getText();
        row[1]= lnTf.getText();
        row[2]= phoneTf.getText();
        row[3]= gpaTf.getText();
        model.addRow(row);

         
        }
        else if(e.getSource()==ClearButton)
        {
        
        fnTf.setText("");
         lnTf.setText("");
          phoneTf.setText("");
           gpaTf.setText("");
        
        
        }
        else if(e.getSource()== DeleteButton)
        {
       int numberofrow = table.getSelectedRow();
       if(numberofrow>=0){
       model.removeRow(numberofrow);
       }
       else{
       JOptionPane.showMessageDialog(null, "No Row Has been Selected or empty");
       
       }
        
        
        }
        else if(e.getSource()==UpdateButton){
        
               int numberofrow = table.getSelectedRow();
               
               String f_Name = fnTf.getText();
               String l_Name = lnTf.getText();
               String phone = phoneTf.getText();
               String gpa = gpaTf.getText();
               model.setValueAt(f_Name,numberofrow ,0 );
               model.setValueAt(l_Name,numberofrow ,1 );
               model.setValueAt(phone,numberofrow ,2 );
               model.setValueAt(gpa,numberofrow ,3 );





        
        }
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        
        RegistrationDemo frame = new RegistrationDemo();
        frame.setVisible(true);
    }

    
    
    
    
}
