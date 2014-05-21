import javax.swing.*;
import java.awt.event.*; 
public class TableGen extends JFrame implements ActionListener {
    
    JLabel l1;
    JTextField t1;
    JList ls;
    JButton b1;
    JPanel p1;
    public TableGen()
    {
         setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        p1=new JPanel();
        l1=new JLabel("prompt :");
        t1 = new JTextField(2);
        ls = new JList();
        
        JScrollPane js = new JScrollPane(ls);
        b1= new JButton ("show table");
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        p1.add(js);
        
        getContentPane().add(p1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        DefaultListModel lm =new DefaultListModel();
        int i=Integer.parseInt(t1.getText());
        for(int j=1;j<=10;j++)
        {
            lm.addElement(i*j);
            ls.setModel(lm);
        }}
    
    
       public static void main(String args[])
        {
          new TableGen();
          
        }
        
    }
  


