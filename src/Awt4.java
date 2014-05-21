import java.awt.*;
public class Awt4 extends Frame{
 {
 setVisible(true);
      setSize(500,200);
      setTitle("My Windows");
      
       Panel P1 = new Panel ();
      TextField T1=new TextField("Watch The font  Style ");
     
      P1.add(T1);
      
       Checkbox c1=  new Checkbox (" Bold", true);
         Checkbox c2=  new Checkbox ("Italic",false);
         P1.add(c1);
         P1.add(c2);
         add(P1);
    }
    
    public static void main (String args[])
  {new Awt4();} 
}
