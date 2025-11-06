package Swing;
import javax.swing.*;
import java.awt.event.*;
public class SwingUI1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("ALIEN-X");
		JLabel label = new JLabel("HALO..YOYO");
		JTextField tf = new JTextField();
		JButton btn = new JButton("Hit me");
		//btn.setBounds(20, 30, 100, 40);
		label.setBounds(50, 120, 180, 30);
		tf.setBounds(50, 170, 180, 30);
		btn.setBounds(90, 220, 100, 40);
		frame.add(label);
		frame.add(tf);
		frame.add(btn);
		frame.setSize(300,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		btn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				String str = tf.getText();
				label.setText(str);
				JOptionPane.showMessageDialog(frame, str);
				
			}
		});
	}

}
