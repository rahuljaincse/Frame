import java.awt.*;
public class Awt2 extends Frame{
{
setSize(400,500);
setVisible(true);
Label L1=new Label ("name");
Label L2=new Label ("email");
Panel P1= new Panel ();
P1.add(L1);
P1.add(L2);
TextField T1=new TextField(20);
P1.add(T1);
Button b1= new Button("start");
       Button b2= new Button("stop");
     P1.add(b1);
     P1.add(b2);



add(P1);


        


}
public static void main (String args[])
{new Awt2();}


}
