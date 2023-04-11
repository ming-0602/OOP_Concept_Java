package Ex1;

import java.util.Arrays;

public class Employee {

    private String firstName;
    private String lastName;

//    private String fn[];

//    private String ln[];

//    public Employee(String fn[], String ln[]) {
    public Employee(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
//        setFn(fn);
//        setLn(ln);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return getFirstName() + " " + getLastName();
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
////                "firstName='" + firstName + '\'' +
////                ", lastName='" + lastName + '\'' +
//                ", fn=" + Arrays.toString(fn) +
//                ", ln=" + Arrays.toString(ln) +
//                '}';
//    }

    public double earnings(){
        return 0; //It won't be our intention to create generic Employee objects here
    }

//    public String[] getFn() {
//        return fn;
//    }
//
//    public void setFn(String[] fn) {
//        this.fn = fn;
//    }
//
//    public String[] getLn() {
//        return ln;
//    }
//
//    public void setLn(String[] ln) {
//        this.ln = ln;
//    }
}

