package Listener;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*; 
public class MouseListener2  extends JFrame implements MouseListener{
	MouseListener2(){  
        addMouseListener(this);  
          
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
	public void mouseClicked(MouseEvent e) {  
        Graphics g=getGraphics();  
        g.setColor(Color.RED);  
        g.fillOval(e.getX(),e.getY(),40,30);  
    }  
    public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
    public void mousePressed(MouseEvent e) {}  
    public void mouseReleased(MouseEvent e) {}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListener2();  
	}

}
