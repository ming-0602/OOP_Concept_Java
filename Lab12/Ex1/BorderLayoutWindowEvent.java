package Ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BorderLayoutWindowEvent extends JFrame implements WindowListener {

    private JButton jb[];
    private JTextArea jt;

    public BorderLayoutWindowEvent() {
        super("Text Box");
        BorderLayout layout = new BorderLayout(3,4);
        setLayout(layout);
        //GUI constructor code unchanged and omitted for brevity except for the following line
        JLabel jb = new JLabel("Please enter something");
        add(jb, BorderLayout.NORTH);
        jt = new JTextArea(10, 10);
        jt.setForeground(Color.BLUE);
        jt.setLineWrap(true);
        add(jt, BorderLayout.CENTER);
        addWindowListener(this);
        setSize(600, 400);
        setVisible(true);
    }


    public static void main(String args[]) {
        BorderLayoutWindowEvent b = new BorderLayoutWindowEvent();
    }


    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Window now opened", "Opening Window",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Now closing window", "Closing Window",
                JOptionPane.INFORMATION_MESSAGE);
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exiting Application Confirmation",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if(choice==JOptionPane.YES_OPTION)
            dispose();

//        jt.getText();

    }

    @Override
    public void windowClosed(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Now closing window", "Closing Window",
                JOptionPane.INFORMATION_MESSAGE);
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exiting Application Confirmation",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if(choice==JOptionPane.YES_OPTION)
            dispose();
    }

    @Override
    public void windowIconified(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Window Minimised", "Window Minimised",
                JOptionPane.INFORMATION_MESSAGE);

        int random = (int)(Math.random()*5);

        remove(jb[random]); //remove a random button from the JFrame window
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Window Unminimised", "Window Unminimised",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
}
