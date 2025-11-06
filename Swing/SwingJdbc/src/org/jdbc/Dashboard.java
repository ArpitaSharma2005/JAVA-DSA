package org.jdbc;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;


public class Dashboard {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Dashboard");
		JButton b1=new JButton("Insert");
		JButton b2=new JButton("View");
		JButton b3=new JButton("Update");
		JButton b4=new JButton("Delete");
		b1.setBounds(120,50,120,50);
		b2.setBounds(120,120,120,50);
		b3.setBounds(120,190,120,50);
		b4.setBounds(120,260,120,50);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		

	}

}