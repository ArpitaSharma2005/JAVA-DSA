package Listener;

import javax.swing.*;  
import java.awt.event.*;  
public class MouseListener1 extends JFrame implements MouseListener{
	 JLabel jl;  
	    MouseListener1(){  
	        addMouseListener(this);  
	          
	        jl=new JLabel();  
	        jl.setBounds(20,50,100,20);  
	        add(jl);  
	        setSize(300,300);  
	        setLayout(null);  
	        setVisible(true);  
	    }  
	    public void mouseClicked(MouseEvent e) {  
	        jl.setText("Mouse Clicked");  
	    }  
	    public void mouseEntered(MouseEvent e) {  
	        jl.setText("Mouse Entered");  
	    }  
	    public void mouseExited(MouseEvent e) {  
	        jl.setText("Mouse Exited");  
	    }  
	    public void mousePressed(MouseEvent e) {  
	        jl.setText("Mouse Pressed");  
	    }  
	    public void mouseReleased(MouseEvent e) {  
	        jl.setText("Mouse Released");  
	    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListener1(); 
	}

}

