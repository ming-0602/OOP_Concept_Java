package labsheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Please enter your Name", "Input", JOptionPane.INFORMATION_MESSAGE);
        int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of km cycled", "Input", JOptionPane.INFORMATION_MESSAGE));
        double fin = 0;
        if (dis > 10){
            double tem = dis - 10;
            fin = (tem * 2.50) + (10 * 1.75);
        }else {
            fin = dis * 1.75;
        }
        JOptionPane.showMessageDialog(null,
                "Name: "+ name+ "\n" +
                        "Age: " + dis + "\n" +
                        "Sponsorship amount due: " + "$" + fin
        );
    }
}
