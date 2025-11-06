package org.jdbc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    public static void main(String[] args) {
        JFrame f = new JFrame("Login Window");
        
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 80, 30);
        
        JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);
        
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 75, 80, 30);
        
        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 75, 100, 30);
        
        JButton b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);
        
        f.add(l1);
        f.add(text);
        f.add(l2);
        f.add(pass);
        f.add(b);
        
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        
        b.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String uname = text.getText();
        		String upass = pass.getText();
        		if(uname.equals("Joh_Deo") && upass.equals("admin124")){
        				Dashboard.main(new String[] {});
        				f.dispose();
        		}
        	else {
        		JOptionPane.showMessageDialog(f,"Wrong Credential try again!");
        	}
        	
        	}
        	
        });
    }
}

