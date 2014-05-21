
import javax.swing.*;
import java.awt.*;

public class Movcar extends JFrame {

    public Movcar() {
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new Movcar();
        getContentPane().add(p1);
    }

    public static void main(String args[]) {
        new Movcar();
    }
}

class Movcar extends JPanel implements Runnable {

    Thread t;
    int x = 10, y = 50;

    public Movcar() {
        setBackground(Color.pink);
        setForeground(Color.blue);
        t = new Thread(this);
        t = start();
    }

    public void run()//control block
    {
        while (true) {
            x = x + 10;
            if (x > 980) {
                x = 10;
                y = 50;
            }
            repaint();
            if (x > 250 && x < 319) {

                try {
                    Thread.sleep(150);
                } catch (Exception e) {
                }
            
                elseif(x == 320);
                {
                    try {
                        thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }}
            else
            {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        }
    }
        }
    protected void paintComponent(Graphics g){

    super.paintComponent(g);
    g.setColor(Color.red);
    g.fillRect(x,y,100,50);
      g.setColor(Color.yellow);
    g.fillRect(x+100,y+25,25,25);
      g.setColor(Color.black);
    g.fillOval(x+15,y+35,25,25);
    g.fillOval(x+45,y+35,25,25);
    g.fillOval(x+95,y+35,25,25);
    g.setColor(Color.blue);
    g.fillRect(0,110,600,25);
    g.setColor(Color.white);
    g.fillRect(450,50,10,55);
    if (x >250&&X<319){
        g.setColor(Color.yellow);
    }
    else if(x==320){
        g.setColor(Color.red);}
    else{
        g.setColor(Color.green);
        
    }
    
    g.fillOval(450,55,12,12);}}


    
    
    
            
            
            
            
            
            
                
            

        
       
            
        
        
        
        
        
    
    

