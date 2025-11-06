package org.jdbc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class AddItem {
    public static void main(String[] args) {
        JFrame f = new JFrame("Add Inventory");

        JLabel jl = new JLabel("Enter Id");
        jl.setBounds(20, 20, 120, 30);
        JTextField tf1 = new JTextField();
        tf1.setBounds(160, 20, 180, 30);
        f.add(jl);
        f.add(tf1);

        JLabel jl2 = new JLabel("Enter Name");
        jl2.setBounds(20, 70, 120, 30);
        JTextField tf2 = new JTextField();
        tf2.setBounds(160, 70, 180, 30);
        f.add(jl2);
        f.add(tf2);

        JLabel jl3 = new JLabel("Enter Catagory");
        jl3.setBounds(20, 120, 120, 30);
        JTextField tf3 = new JTextField();
        tf3.setBounds(160, 120, 180, 30);
        f.add(jl3);
        f.add(tf3);

        JLabel jl4 = new JLabel("Enter Quantity");
        jl4.setBounds(20, 170, 120, 30);
        JTextField tf4 = new JTextField();
        tf4.setBounds(160, 170, 180, 30);
        f.add(jl4);
        f.add(tf4);

        JLabel jl5 = new JLabel("Enter Price");
        jl5.setBounds(20, 220, 120, 30);
        JTextField tf5 = new JTextField();
        tf5.setBounds(160, 220, 180, 30);
        f.add(jl5);
        f.add(tf5);

        JButton b = new JButton("Save");
        b.setBounds(150, 270, 120, 40);
        f.add(b);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = tf1.getText();
                String name = tf2.getText();
                String catagory = tf3.getText();
                int quantity = Integer.parseInt(tf4.getText());
                double price = Double.parseDouble(tf5.getText()); // ✅ fix

                Connection con;
                try {
                    con = ConnectionProvider.provideCon();
                    PreparedStatement pstm = con.prepareStatement("insert into items values(?,?,?,?,?)");
                    pstm.setString(1, id);
                    pstm.setString(2, name);
                    pstm.setString(3, catagory);
                    pstm.setInt(4, quantity);
                    pstm.setDouble(5, price);
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(f, "Record Inserted!");
                } catch (Exception e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(f, "Error: " + e1.getMessage());
                }
            }
        });
    }
}
