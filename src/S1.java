import javax.swing.*;

public class S1 extends JFrame {
    JLabel L1,L2;
    JTextField T1;
    JPasswordField T2;
    JButton B1,B2;
    JPanel p1;
    public S1()
    {
        setVisible(true);
        setSize(500,500);
        setTitle("Application Form");
        p1=new JPanel();
        L1=new JLabel("user name");
           L2=new JLabel("pass word");
              T1=new JTextField("20");
                 T2=new JPasswordField("20");
                 B1=new JButton ("login");
                 B2=new JButton ("cancel");
                 
                 p1.add(L1);
                  p1.add(T1);
                   p1.add(L2);
                    p1.add(T2);
                     p1.add(B1);
                      p1.add(B2);
                       getContentPane().add(p1);}
    public static void main (String args[])
    {    
                       
     new S1();              
    }
            
    
    
    
    

}
