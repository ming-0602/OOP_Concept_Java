package Ex3;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String input = "";
        Book bk = new Book();
        input += bk.toString();
        JOptionPane.showMessageDialog(null, input, "Input" , JOptionPane.INFORMATION_MESSAGE);
        Book bk2 = new Book("The Davinci Code", 19.99, "23324324", 348);
        input += bk2.toString();
        JOptionPane.showMessageDialog(null, input, "Input", JOptionPane.INFORMATION_MESSAGE);

    }
}
