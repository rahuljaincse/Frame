import java.awt.*;
public class Awt6 extends Frame{
    
    {
        setSize (400,150);
        setVisible(true);
        setTitle("List Test");
        Panel P1=new Panel();


List ls= new List(3,false);
ls.add("Black");
ls.add("Blue");
ls.add("Cyan");
ls.add("Green");
ls.add("Pink");
P1.add(ls);
add(P1);


    }
    public static void main (String args[])
    {
        new Awt6();



    }
}
        

  