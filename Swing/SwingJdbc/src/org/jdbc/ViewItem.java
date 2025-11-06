package org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ViewItem {

    public static void main(String[] args) {

        JFrame f = new JFrame("View Record");
        String id = null;
        String name = null;
        String category = null;
        int quantity = 0;
        double price = 0;
        String pid = Search.id;

        Connection con = ConnectionProvider.provideCon();
        try {
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM items WHERE id=?");
            pstm.setString(1, pid);
            ResultSet rs = pstm.executeQuery();

            if (rs != null && rs.next()) {
                id = rs.getString(1);
                name = rs.getString(2);
                category = rs.getString(3);
                quantity = rs.getInt(4);
                price = rs.getDouble(5);
            } else {
                JOptionPane.showMessageDialog(f, "Record not found!");
            }
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(f, "Error: " + e1.getMessage());
        }

        // Displaying the result in the frame
        JLabel l1 = new JLabel("Id Is: " + id);
        l1.setBounds(10, 10, 200, 30);
        JLabel l2 = new JLabel("Name Is: " + name);
        l2.setBounds(10, 60, 200, 30);
        JLabel l3 = new JLabel("Category: " + category);
        l3.setBounds(10, 110, 200, 30);
        JLabel l4 = new JLabel("Quantity: " + quantity);
        l4.setBounds(10, 160, 200, 30);
        JLabel l5 = new JLabel("Price: " + price);
        l5.setBounds(10, 210, 200, 30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close the frame properly
    }
}
