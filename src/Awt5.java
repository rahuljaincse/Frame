import java.awt.*;
public class Awt5 extends Frame
{
    {
 setVisible(true);
      setSize(500,200);
      setTitle("Radio Button Text");
      setBackground(Color.RED);
      setForeground(Color.BLUE);
     
       Panel P1 = new Panel ();
      TextField T1=new TextField("Watch The Font Style change");
     
      P1.add(T1);
      CheckboxGroup cbg =  new CheckboxGroup ();
       Checkbox r1=  new Checkbox ("Bold",cbg, true);
         Checkbox r2=  new Checkbox ("Italic",cbg,false);
         Checkbox r3=  new Checkbox ("Plane",cbg,false);
         Checkbox r4=  new Checkbox ("Bold Italic",cbg,false);
         P1.add(r1);
         P1.add(r2);
         P1.add(r3);
         P1.add(r4);
                 Choice  ch1=new Choice ();
ch1.add("Black");  
ch1.add("Blue");
ch1.add("Cyan");
ch1.add("Green");
ch1.add("Pink");
P1.add(ch1);

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
  {new Awt5();} 

}
