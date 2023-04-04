package labsheet2;

import javax.swing.*;
import java.util.Random;

public class RollTheDice {
    public static void main(String[] args) {
        boolean index = true; int comwin = 0; int playwin = 0; int draw = 0; int tem = 0; int tem2 = 0;
        while (index){
            String opt = JOptionPane.showInputDialog(null, "Do you want to roll the dice", "Input", JOptionPane.INFORMATION_MESSAGE);
            if(opt.equals("yes")){
                tem = rollTheDice();
                JOptionPane.showMessageDialog(null, "Robot: " + tem, "Input", JOptionPane.INFORMATION_MESSAGE);
                tem2 = rollTheDice();
                JOptionPane.showMessageDialog(null, "You: " + tem2, "Input", JOptionPane.INFORMATION_MESSAGE);
                if(tem > tem2){
                    comwin++;
                } else if (tem < tem2) {
                    playwin++;
                }else {
                    draw++;
                }
                JOptionPane.showMessageDialog(null,
                        "Game Played: " + index + "\n" +
                                "Computer Wins: " + comwin + "\n" +
                                "Player Wins: " + playwin + "\n" +
                                "Draws" + draw
                );
            }else {
                JOptionPane.showMessageDialog(null, "Bye" , "Input", JOptionPane.INFORMATION_MESSAGE);
                index = false;
                System.exit(0);
            }
        }

    }

    public static int rollTheDice(){
        Random rnd = new Random();
        return rnd.nextInt(1, 6);
    }

}
