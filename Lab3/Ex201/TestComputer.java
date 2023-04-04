package Ex201;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {


        String output = "";
//        Testing without arguments
        Computer c1 = new Computer();
        c1.setPrice(-3.75);
        output += "Calling the no-argument Computer Constructor. " +
                "The first Computer object details are: \n\n" +
                "Manufacturer: " + c1.getManufacturer() + " Type: " + c1.getType() + " Speed: " + c1.getSpeed() + " RAM: " + c1.getRAM() + " Price: " + c1.getPrice();
//        JOptionPane.showMessageDialog(null, output, "Compter Object Data", JOptionPane.INFORMATION_MESSAGE);
//        System.exit(0);

//        Testing with arguments

        Computer c2 = new Computer("Dell" , "Laptop", 3.25,16, 550.99);
        c2.setManufacturer("Apple");
        c2.setType("Desktop");
        c2.setSpeed(2.9);
        c2.setRAM(12);
        c2.setPrice(865.0);
//        output += "\n\nCalling the multi-argument Computer constructor. " +
//                "The second Computer object details are: \n\n" +
//                "Manufacturer: " + c2.getManufacturer() + "Type: " + c2.getType() + "Speed: " + c2.getSpeed() + "RAM: " + c2.getRAM() + "Price: " + c2.getPrice();
        output += "Calling the no-argument Computer constructor." +
                "The first Computer object details are: \n\n" + c2.toString();

        JOptionPane.showMessageDialog(null, output, "Computer Object Data", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

}
