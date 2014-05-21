import javax.swing.*;
import java.awt.*;
public class Ball extends JFrame {
    public Ball(){
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1= new gp();
        getContentPane().add(p1);}
    public static void main (String args []){
        new Ball ();}}
class gp extends JPanel implements Runnable{
    int X_Pos=10;
    int Y_Pos=100;
    int radius =20;
    public gp(){
        setBackground(Color.GREEN);
        Thread th = new Thread(this);
        th.start();}
    public void run(){
        while(true){
X_Pos++;
repaint();
try {
    Thread.sleep(10);}
catch(InterruptedException ex){
}
Thread.currentThread().setPriority(Thread.MAX_PRIORITY);}}
    protected void paintComponent(Graphics g){
        super.paintComponent (g);
        g.setColor(Color.YELLOW);
        g.fillOval(X_Pos-radius,Y_Pos-radius,2*radius,2*radius);
    }}   
        
        
        
        
  