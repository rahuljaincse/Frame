import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class S3 extends JFrame implements ItemListener 
        
{   JTextField t1;
    JCheckBox ch1,ch2;
    JPanel p1;
    public  S3()
     { 
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        p1=new JPanel();
        t1=new JTextField(20);
        ch1=new JCheckBox("Bold");
        ch2=new JCheckBox("Italic");
        p1.add(t1);
        p1.add(ch1);
        p1.add(ch2);
        t1.setBackground(Color.YELLOW);
        t1.setForeground(Color.BLUE);
        Color c= new Color(20,20,200);//R,G,B
        p1.setBackground(Color.CYAN);
        ch1.addItemListener(this);
        ch2.addItemListener(this);
      
    }
    public void itemChanged (ItemEvent  e){
        Font F;
        if (ch1.isSelected()==true&& ch2.isSelected()==true)
        {
            F=new Font("Ariel",Font.BOLD+Font.ITALIC,20);
        }
        else if(ch1.isSelected())
        { F=new Font("Ariel",Font.BOLD,20);
        }
        else if(ch2.isSelected())
        {F=new Font("Ariel",Font.ITALIC,20);
        }
        else  {
            F=new Font("Ariel",Font.PLAIN,20);
        }
         t1.setFont(F);
    }
    public static void main (String args[])
    {new S3();
    } 
}
