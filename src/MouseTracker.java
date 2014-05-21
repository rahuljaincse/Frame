
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseTracker extends JFrame implements MouseListener,
        MouseMotionListener {

    JLabel StatusBar;

    public MouseTracker() {
        setVisible(true);
        setSize(400, 400);
        StatusBar = new JLabel();
        getContentPane().add(StatusBar);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        StatusBar.setText("clicked at" + e.getX() + "," + e.getY() + "]");
    }

    public void mousePressed(MouseEvent e) {
        StatusBar.setText("pressed at" + e.getX() + "," + e.getY() + "]");
    }

    public void mouseRelesed(MouseEvent e) {
        StatusBar.setText("relesed at" + e.getX() + "," + e.getY() + "]");
    }

    public void mouseEntered(MouseEvent e) {
        StatusBar.setText("entered at" + e.getX() + "," + e.getY() + "]");

        getContentPane().setBackground(Color.GREEN);
    }

    public void mouseExited(MouseEvent e) {
        StatusBar.setText("mouse out side window");
        getContentPane().setBackground(Color.WHITE);
    }

    public void mouseDragged(MouseEvent e) {
        StatusBar.setText("dragged at" + e.getX() + "," + e.getY() + "]");
    }

    public void mouseMoved(MouseEvent e) {
        StatusBar.setText("moved at" + e.getX() + "," + e.getY() + "]");

    }

    public static void main(String args[]) {

        MouseTracker application = new MouseTracker();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
