
import java.awt.image.ColorModel;
import javax.swing.*;
import javax.swing.event.*;

public class Slider extends JFrame implements ChangeListener {
    JPanel p1;
    JLabel l1;
    JSlider js1,js2,js3;
    public Slider()
    {
      p1 = new JPanel();
      l1= new JLabel("value");
      js1= new JSlider(JSlider.HORIZONTAL ,1,100,10);
       js2= new JSlider(JSlider.HORIZONTAL ,1,100,10);
      
        js3= new JSlider(JSlider.HORIZONTAL ,1,100,10);
        js1.addChangeListener(this);
         js2.addChangeListener(this);
          js3.addChangeListener(this);
          
          
          p1.add(l1);
          p1.add(js1);
          p1.add(js2);
          p1.add(js3);
           setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(p1);
      
    
    }
    public void stateChanged (ChangeEvent e)
            
        
    {
            JSlider Source=((JSlider) e.getSource ());
            l1.setText(String.valueOf(Source.getValue()));
           
           
            
          
    }
    
    public static void main (String args [])
    {
        new Slider();
    }
    
        
        
    } 
    
    
    


