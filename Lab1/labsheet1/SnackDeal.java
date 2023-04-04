package labsheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Please enter your Name", "Input", JOptionPane.INFORMATION_MESSAGE);
        String course = JOptionPane.showInputDialog(null, "Please enter your course", "Input", JOptionPane.INFORMATION_MESSAGE);
        int total = Integer.parseInt(JOptionPane.showInputDialog(null, "How many snacks would you like?", "Input", JOptionPane.INFORMATION_MESSAGE));

        int tem = total * 2;

        JOptionPane.showMessageDialog(null,
                "Name: "+ name+ "\n" +
                        "Course: " + course + "\n" +
                        "Snacks: " + total + "\n" +
                        "Cost: " + "$"+ tem);
    }
}
