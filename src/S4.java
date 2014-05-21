import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class S4 extends JFrame implements ItemListener 
        
{  JComboBox c1;
   JLabel l1;
    JPanel p1;
    public  S4()
     { 
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        p1=new JPanel();
        l1=new JLabel();
        
        p1.add(c1);
        p1.add(l1);
        getContentPane().add(p1);
        c1.addItemListener(this);
       
       
    }
    public void itemStartChange(ItemEvent e){
        StringPath=    }
    public static void main (String args[])
    {new S4();
    } 
}
