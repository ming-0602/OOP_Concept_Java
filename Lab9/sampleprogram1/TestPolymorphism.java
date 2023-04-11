package sampleprogram1;

import Ex1.SelfEmployedWorker;

public class TestPolymorphism {
    public static void main(String args[])
    {
        double tem = 400 + (Math.random() * 900);
        Employee employeeRef; //a reference to the Employee superclass
//        String tem1[] = {"Joe", "Mary", "Richard"};
//        String tem2[] = {"Smith", "O'Niell", "Branson"};
        Employee emp[] = new Employee[3];
        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);
        SelfEmployedWorker slf = new SelfEmployedWorker("Richard", "Branson", 0);
        emp[0] = b1;
        emp[1] = hw1;
        emp[2] = slf;

//        employeeRef=b1; //recall a Boss "is a" Employee so this assignment is allowed

        //will now use the Employee reference object to display the correct information via polymorphism

//        System.out.println(employeeRef.toString() + " and the earnings were €" + String.format("%.2f",employeeRef.earnings()));

//        employeeRef=hw1; //recall that an HourlyWorker "is a" Employee so this is okay too

        //will now use the Employee reference object to display the correct information via polymorphism

        //note the generic nature of the code here

//        System.out.println("\n" + employeeRef.toString() + " and the earnings were €" + String.format("%.2f",employeeRef.earnings()));

//        employeeRef=slf;


//        System.out.println("\n" + employeeRef.toString() + " and the earnings were $" + String.format("%.2f",employeeRef.earnings()));

        for (int i = 0; i < emp.length; i++) {
            System.out.println("\n" + emp[i].toString() + " and the earnings were $" + String.format("%.2f",emp[i].earnings()));
        }
    }
}