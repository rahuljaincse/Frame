
import javax.swing.*;
import javax.swing.event.*;

public class List extends JFrame implements ListSelectionListener {

    JList ls;

    public List() {
        setVisible(true);
        setSize(400, 400);
        JPanel p1 = new JPanel();
        String a[] = {"1", "2", "3", "4", "5", "6"};
        ls = new JList(a);
        ls.addListSelectionListener(this);
        JScrollPane jsp = new JScrollPane(ls);
        ls.setVisibleRowCount(3);
        p1.add(jsp);
        getContentPane().add(p1);
    }

    public void valueChanged(ListSelectionEvent e) {
        String msg = "current selected item:" + ls.getSelectedValue();
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void main(String args[]) {
        new List();


    }
}
