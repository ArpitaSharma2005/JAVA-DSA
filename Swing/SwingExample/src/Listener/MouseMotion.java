package Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotion extends JFrame implements MouseMotionListener {
    JLabel jl;  
    Color c = Color.BLUE;  

    MouseMotion() {  
        jl = new JLabel();  
        jl.setBounds(20, 40, 100, 20);  
        add(jl);  
      
        addMouseMotionListener(this);  
      
        setSize(400, 400);  
        setLayout(null);  
        setVisible(true);  
    }  

    public void mouseDragged(MouseEvent e) {  
        jl.setText("X=" + e.getX() + ", Y=" + e.getY());  
        Graphics g = getGraphics();  
        g.setColor(Color.RED);  
        g.fillOval(e.getX(), e.getY(), 10, 10);  
    }  

    public void mouseMoved(MouseEvent e) {  
        jl.setText("X=" + e.getX() + ", Y=" + e.getY());  
    }  

    public static void main(String[] args) {
        new MouseMotion();
    }
}
