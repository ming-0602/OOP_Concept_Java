package Ex201;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        String input = "";

        BankAccount bk = new BankAccount();
        input += "Calling the no Argument BankAccount construct. The first BankAccount object details are: \n" + bk.toString() + "\n";
        JOptionPane.showMessageDialog(null, input, "Input", JOptionPane.INFORMATION_MESSAGE);

        BankAccount bk2 = new BankAccount("Someting Wong" , 1544);
        bk2.setInterest_rate(01);
        input += "Calling the Argument BankAccount construct. The first BankAccount object details are: \n" + bk2.toString() + "\n";
        JOptionPane.showMessageDialog(null, input, "Input", JOptionPane.INFORMATION_MESSAGE);


        BankAccount bk3 = new BankAccount();
        bk3.setInterest_rate(0.5);
        for (int i = 0; i < 2; i++) {
            String name = JOptionPane.showInputDialog(null, "Please Enter Owner Name: ", "Input" , JOptionPane.INFORMATION_MESSAGE);
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Accouunt Number : ", "Input" , JOptionPane.INFORMATION_MESSAGE));
            bk3.setNumber(num);
            bk3.setOwner(name);
            input += "Calling the no Argument BankAccount construct. The BankAccount object details are: \n" + bk3.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, input, "Input", JOptionPane.INFORMATION_MESSAGE);
    }
}
