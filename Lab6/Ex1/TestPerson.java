package Ex1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {
        Person pr = new Person();
        JOptionPane.showMessageDialog(null, "Calling the Person(String str, String str2)\n " + pr.toString(), "Output", JOptionPane.INFORMATION_MESSAGE);
        Person pr2 = new Person("Before", "Change");
        JOptionPane.showMessageDialog(null, "Calling the Person(String str, String str2)\n " + pr2.toString(), "Output", JOptionPane.INFORMATION_MESSAGE);
        String first = JOptionPane.showInputDialog(null, "Please Enter First Name", "Input", JOptionPane.INFORMATION_MESSAGE);
        String last = JOptionPane.showInputDialog(null, "Please Enter Last Name", "Input", JOptionPane.INFORMATION_MESSAGE);
        pr.setFirstname(first);
        pr.setLastname(last);
        JOptionPane.showMessageDialog(null, "Calling the Person(String str, String str2)\n " + pr.toString(), "Output", JOptionPane.INFORMATION_MESSAGE);
    }
}
