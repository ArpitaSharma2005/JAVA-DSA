package Swing;

import javax.swing.*;

public class OP3 {
    JFrame f;

    OP3() {
        f = new JFrame();
        String name = JOptionPane.showInputDialog(f, "Enter Name");
        System.out.println(name);
    }

    public static void main(String[] args) {
        new OP3(); 
    }
}
