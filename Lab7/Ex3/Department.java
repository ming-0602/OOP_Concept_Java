package Ex3;

import java.util.Arrays;

public class Department {
    private String name;
    private Student Students[];

    @Override
    public String toString() {
//        return "Department{" +
//                "name='" + name + '\'' +
//                ", Students=" + Arrays.toString(Students) +
//                '}';
        String output = "";

        output += "Department: " + "\n" + "Name: " + getName() +  "\n" + "List of Students: " + "\n\n";

        for (int i = 0; i < getStudents().length; i++) {
            if (Students[i]!= null){
                output += Students[i] + "\n";
            }
        }

        output += "\n";

        return output;
    }

//    @Override
//    public String toString() {
////        return "Departments:" +
////                "\nName: " + getName() + "\n" +
////                "List of Students: \n";
//        String output = "Departments:\n";
//        for (int i = 0; i < getStudents().length; i++) {
//            if (getStudents()!=null){
//                output += "Name: " + getStudents() + "\n" + "";
//            }
//        }
//        return output;
//
//    }

    public Department(String name, Student[] students) {
        setName(name);
//        Students = students;
        setStudents(students);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return Students;
    }

    public void setStudents(Student[] students) {
        Students = students;
    }
}
