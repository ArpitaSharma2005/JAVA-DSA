package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MiniCalculator {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Mini Calculator");
		JLabel label1=new JLabel("Enter First Value");
		JLabel label2=new JLabel("Enter Second Value");
		JLabel label3=new JLabel("Result: ");
		JTextField tf1=new JTextField();
		JTextField tf2=new JTextField();
		JTextField tf3=new JTextField();
		JButton btnadd=new JButton("+");
		JButton btnsub=new JButton("-");
		
		
		
		label1.setBounds(10, 40, 180, 30);
		tf1.setBounds(200, 40, 150, 30);
		
		label2.setBounds(10, 80, 180, 30);
		tf2.setBounds(200, 80, 150, 30);
		
		label3.setBounds(10, 120, 180, 30);
		tf3.setBounds(200, 120, 150, 30);
		tf3.setEditable(false);
		btnadd.setBounds(70, 180, 100, 40);
		btnsub.setBounds(200, 180, 100, 40);
		
		
		frame.add(label1);
		frame.add(tf1);
		frame.add(label2);
		frame.add(tf2);
		frame.add(label3);
		frame.add(tf3);
		frame.add(btnadd);
		frame.add(btnsub);
		
		
		//frame.add(btn);
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		btnadd.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(tf1.getText());
				int n2 = Integer.parseInt(tf2.getText());
				int res = n1 + n2;
				tf3.setText(String.valueOf(res));
			}
		});
		
		btnsub.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(tf1.getText());
				int n2 = Integer.parseInt(tf2.getText());
				int res = n1 - n2;
				tf3.setText(String.valueOf(res));
			}
		});

	}

}
