package Ex2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen","This is a black pen");
        Product p12 = new Product(12, "Blue Pen","This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

//Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15));

        for (Product c: allProducts) {
            if(c != null){
                System.out.println(c);
            }
        }

        addProduct(allProducts);
        viewProducts(allProducts);

    }



    public static void addProduct(ArrayList<Product> allProducts){
        int prodid = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the product id: "));
        String prodname = JOptionPane.showInputDialog("Please enter the name: ");
        String proddes = JOptionPane.showInputDialog("Please insert description: ");
        Product pro = new Product(prodid,prodname,proddes);
        allProducts.add(pro);
        JOptionPane.showMessageDialog(null,"Product now Created and added to the list", "Product Added", 1);
    }

    public static void viewProducts(ArrayList<Product> allProducts) {
        String output = "";
        for (Product p : allProducts)
            output += p + "\n";
        JOptionPane.showMessageDialog(null, output, "List of all Products", 1);
    }


}
