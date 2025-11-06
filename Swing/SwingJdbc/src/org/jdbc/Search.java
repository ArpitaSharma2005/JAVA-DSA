package org.jdbc;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Search {
	public static String id;
	public static void main(String[] args) {
		JFrame f=new JFrame();
		id=JOptionPane.showInputDialog(f,"Enter Id to search:");
		ViewItem.main(new String[]{});

	}

}
