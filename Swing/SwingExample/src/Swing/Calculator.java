package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args){
		JFrame frame = new JFrame("ALE-CAL");
		JLabel label1 = new JLabel("Enter First Value;");
		JLabel label2 = new JLabel("Enter second Value;");
		JLabel label3 = new JLabel("Result: ");
		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField();
		JTextField tf3 = new JTextField();
		JButton btn = new JButton("Calculate");
		
		JRadioButton rb1 = new JRadioButton("Addition");
		JRadioButton rb2 = new JRadioButton("Subtraction");
		JRadioButton rb3 = new JRadioButton("Multiplication");
		JRadioButton rb4 = new JRadioButton("Division");
		
		label1.setBounds(10,40,180,30);
		tf1.setBounds(200, 40, 150, 30);
		
		label2.setBounds(10, 80, 180, 30);
		tf2.setBounds(200, 80, 150, 30);
		
		label3.setBounds(10, 120, 180, 30);
		tf3.setBounds(200, 120, 150, 30);
		tf3.setEditable(false);
		btn.setBounds(250, 350, 100, 60);
		
		rb1.setBounds(20, 220, 150, 30);
		rb2.setBounds(20, 260, 150, 30);
		rb3.setBounds(20, 310, 150, 30);
		rb4.setBounds(20, 350, 150, 30);
		 ButtonGroup bg=new ButtonGroup();  
		 bg.add(rb1);bg.add(rb2);bg.add(rb3);bg.add(rb4);
		
		frame.add(label1);
		frame.add(tf1);
		frame.add(label2);
		frame.add(tf2);
		frame.add(label3);
		frame.add(tf3);
		frame.add(btn);
		
		frame.add(rb1);
		frame.add(rb2);
		frame.add(rb3);
		frame.add(rb4);
		
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1;
				String s2;
				s1 = tf1.getText();
				s2 = tf2.getText();
				double n1 = 0, n2 = 0;
				if(s1.isEmpty() || s2.isEmpty())
				{
					JOptionPane.showMessageDialog(frame,  "Please enter val for field");
				}
				else{
					n1 = Double.parseDouble(s1);
					n2 = Double.parseDouble(s2);
				}
				double res = 0;
				if(rb1.isSelected())
				{
					res = n1+n2;
				}
				if(rb2.isSelected())
				{
					res = n1-n2;
				}
				if(rb3.isSelected())
				{
					res = n1*n2;
				}
				if(rb4.isSelected())
				{
					res = n1/n2;
				}
				tf3.setText(String.valueOf(res));
			}
		});
	}

}
