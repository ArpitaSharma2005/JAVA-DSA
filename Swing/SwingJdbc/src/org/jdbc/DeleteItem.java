
package org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DeleteItem {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		String pid = JOptionPane.showInputDialog(f,"Enter Id to Delete: ");
		Connection con = ConnectionProvider.providerCon();
		try {
			PreparedStatement pstm = con.prepareStatement("delete form items where id = ?");
			pstm.setString(1, pid);
			pstm.executeUpdate();
			JOptionPane.showMessageDialog(f, "Record Deleted Sucessfully!");
		}
		catch(Exception e1) {}
	}
		

}
