package Swing;
import javax.swing.*;
public class OP2 {
	JFrame f;
	OP2(){
		f = new JFrame();
		JOptionPane.showMessageDialog(f,"Successfully update.","Alert",JOptionPane.WARNING_MESSAGE);
	}
	public static void main(String[] args) {
		new OP2();
	}

}
