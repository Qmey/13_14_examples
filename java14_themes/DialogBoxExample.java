package java14_themes;

import javax.swing.JOptionPane;

public class DialogBoxExample {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter your name:");
        System.out.println("Hello, " + input);
    }
}

