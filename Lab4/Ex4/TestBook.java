package Ex4;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String input = "";
        Book bk = new Book();
        /*input += bk.toString();
        JOptionPane.showMessageDialog(null, input, "Input" , JOptionPane.INFORMATION_MESSAGE);
        Book bk2 = new Book("The Davinci Code", 19.99, "23324324", 348);
        input += bk2.toString();
        JOptionPane.showMessageDialog(null, input, "Input", JOptionPane.INFORMATION_MESSAGE);*/

        String name = JOptionPane.showInputDialog(null, "Please enter the title of your favourite book", "Input", JOptionPane.INFORMATION_MESSAGE);
        bk.setTitle(name);
        String Isbn = JOptionPane.showInputDialog(null, "Please enter the ISBN of your favourite book", "Input", JOptionPane.INFORMATION_MESSAGE);
        bk.setISBN(Isbn);
        double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Price", "Input", JOptionPane.INFORMATION_MESSAGE));
        bk.setPrice(price);
        int pages = Integer.parseInt(JOptionPane.showInputDialog(null, "Pages", "Input", JOptionPane.INFORMATION_MESSAGE));
        bk.setPrice(pages);
        input += bk.toString();
        JOptionPane.showMessageDialog(null, input, "Input", JOptionPane.INFORMATION_MESSAGE);


    }
}
